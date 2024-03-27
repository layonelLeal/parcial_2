package acasi_supabaseconnection;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author layonel
 */
class Supabase {

    public Supabase(String urlLogin, String anonkey){
        try {
            // Define la URL a la que deseas enviar la solicitud POST
            String urlSupabase = urlLogin;

            // Datos que deseas enviar en el cuerpo de la solicitud POST (en formato JSON)
            String postData = "{\"email\": \"lleald@unal.edu.co\", \"password\": \"AdminACASI\"}";
            //crear una clase de tipo Body(Map) {"clave": valor}
            // body.toString();
            
            //definir una variable de string = "{"
            //recorrer el mapa, obtener la clave y el valor
            //string += "\"" + clave + "\" : \"" + valor;  

            // Abre una conexión HTTP
            URL url = new URL(urlSupabase);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true); //permite leer y modificar el body

            // Configura las propiedades de la solicitud
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("apiKey", anonkey);
            //connection.setRequestProperty("Content-Length", Integer.toString(postData.length()));

            // Escribe los datos en el flujo de salida de la conexión
            connection.getOutputStream().write(postData.getBytes()); //guardar información al body      

            // Lee la respuesta del servidor
            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    
                    //Revisar despues
                    //try {
                        //JSONObject object = new JSONObject();
                        //System.out.println("-----------------------");
                      //  System.out.println(object.get("access_token"));
                    //} catch (JSONException e) {
                      //  System.out.println("No se pudo volver un json." + e.getMessage());
                    //}
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
