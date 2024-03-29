/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acasi_supabaseconnection;

import java.util.Map;
import org.json.JSONObject;

/**
 *
 * @author Santiago
 */
public class Body {
    
    public Body(Map map){
        JSONObject jo = new JSONObject(map);
        System.out.println(jo.toString());
    }
}
