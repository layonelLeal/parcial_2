package controlador;

public class Orden {
    public String products;
    public Integer totalPrice;

    public Orden(String products, Integer totalPrice) {
        this.products = products;
        this.totalPrice = totalPrice;
    }

    public String getProducts() {
        return products;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }
 
}
