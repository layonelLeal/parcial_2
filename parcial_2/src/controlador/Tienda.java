package controlador;
import org.json.JSONArray;
import org.json.JSONObject;
import supabase.Filter;
import supabase.Supabase;

public class Tienda {
    private static Supabase supabase;
    
    static private void conectSupabase(){
        supabase = new Supabase("https://gakcamvrtyvxddjgaxdv.supabase.co/", 
                                "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Imdha2NhbXZydHl2eGRkamdheGR2Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3MjMxNDI0NzMsImV4cCI6MjAzODcxODQ3M30.FY-7olIu97wwuUyVPsdrjwa7IMvUv1Y6XDIJPKi5NNY");
    }
    
    static public void login(){
        conectSupabase();
        supabase.auth.LoginWithEmailAndPassword("lleald@unal.edu.co", "parcial");
    }
    
    static public Verdura[] getVerduras(){
        System.out.println("Obteniendo verduras");
        JSONArray response = supabase.from("productos").select("*", new Filter("type", "eq", "verdura"));
        System.out.println(response.toString());
        Verdura[] verduras = new Verdura[response.length()];
        for (int i = 0; i < response.length(); i++) {
            JSONObject verdura = response.getJSONObject(i);
            verduras[i] = new Verdura(verdura.getInt("price"), verdura.getString("name"));
        }
        return verduras;
    }
    
    static public Fruta[] getFrutas(){
        System.out.println("Obteniendo frutas");
        JSONArray response = supabase.from("productos").select("*", new Filter("type", "eq", "fruta"));
        System.out.println(response.toString());
        Fruta[] frutas = new Fruta[response.length()];
        for (int i = 0; i < response.length(); i++) {
            JSONObject verdura = response.getJSONObject(i);
            frutas[i] = new Fruta(verdura.getInt("price"), verdura.getString("name"));
        }
        return frutas;
    }
    
}
