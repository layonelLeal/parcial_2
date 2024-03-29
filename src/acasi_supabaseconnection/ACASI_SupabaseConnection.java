/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acasi_supabaseconnection;

/**
 *
 * @author layonel
 */
public class ACASI_SupabaseConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Supabase sup = new Supabase("https://rrkotxwnjddvzolduptl.supabase.co/auth/v1/token?grant_type=password",
                "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InJya290eHduamRkdnpvbGR1cHRsIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MTEzNzU3NTMsImV4cCI6MjAyNjk1MTc1M30.f_wch4K52M85qijPY3ovSynCUoH2ax9eyknWnIJDmuQ");
        
    }
    
}