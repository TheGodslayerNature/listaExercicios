package secao13.exercicio;

public class OrderItem {
    private final int quantity;
    private final double price;
    public OrderItem(int quantity, Product product) {
        this.quantity = quantity;
        this.price = product.getPrice();
    }
    public double subTotal(){
        return quantity * price;
    }
}
