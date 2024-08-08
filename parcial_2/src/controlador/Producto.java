package controlador;

public class Producto {
    private Integer price;
    private String name;

    public Producto(Integer price, String name) {
        this.price = price;
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    
}
