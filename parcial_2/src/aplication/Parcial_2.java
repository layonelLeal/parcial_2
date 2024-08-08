package aplication;
import controlador.Tienda;
import vista.Aplication;

public class Parcial_2 {
    
    public static void main(String[] args) {
        Tienda.login();
        Aplication apli = new Aplication();
        apli.setVisible(true);
        apli.setLocationRelativeTo(null);
        apli.setLocation(0, 0);
    }
    
}
