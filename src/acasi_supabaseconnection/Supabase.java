package acasi_supabaseconnection;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author layonel
 */
class Supabase {
    //https://rrkotxwnjddvzolduptl.supabase.co/auth/v1/signup
    //anon: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InJya290eHduamRkdnpvbGR1cHRsIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MTEzNzU3NTMsImV4cCI6MjAyNjk1MTc1M30.f_wch4K52M85qijPY3ovSynCUoH2ax9eyknWnIJDmuQ
    //"Content-Type: application/json" \
    //-d '{
        //"email": "someone@email.com",
        //"password": "weDWCAyNDtqrSrhuPhQu"
    //}'
    public Supabase(String urlLogin, String anonkey){
        try {
            // Define la URL a la que deseas enviar la solicitud POST
            String urlSupabase = urlLogin;

            // Datos que deseas enviar en el cuerpo de la solicitud POST (en formato JSON)
            String postData = "{\"email\": \"lleald@unal.edu.co\", \"password\": \"AdminACASI\"}";

            // Abre una conexión HTTP
            URL url = new URL(urlSupabase);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            // Configura las propiedades de la solicitud
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("apiKey", anonkey);
            connection.setRequestProperty("Content-Length", Integer.toString(postData.length()));

            // Escribe los datos en el flujo de salida de la conexión
            try (DataOutputStream dos = new DataOutputStream(connection.getOutputStream())) {
                dos.writeBytes(postData);
            }

            // Lee la respuesta del servidor
            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
