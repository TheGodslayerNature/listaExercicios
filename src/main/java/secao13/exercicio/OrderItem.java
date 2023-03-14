package secao13.exercicio;

public class OrderItem {
    private final int quantity;
    private final double price;
    private final Product product;
    public OrderItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
        this.price = product.getPrice();
    }
    public double subTotal(){
        return quantity * price;
    }
    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }
    public String toString(){
        return product.getName() + ", $" + getPrice() + ", Quantity: " + getQuantity() + ", Subtotal: $" + subTotal();
    }
}
