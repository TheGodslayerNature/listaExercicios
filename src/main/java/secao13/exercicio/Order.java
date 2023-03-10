package secao13.exercicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private final OrderStatus status;
    private final Date moment;
    private final Client client;
    private final List<OrderItem> items = new ArrayList<>();
    public Order(Date moment, OrderStatus status,Client client) {
        this.status = status;
        this.moment = moment;
        this.client = client;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Date getMoment() {
        return moment;
    }
    public void addItem(OrderItem item){
        items.add(item);
    }
    public List<OrderItem> getItems() {
        return items;
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public boolean hasClient() {
        return client != null;
    }

    public double total() {
        double total = 0;
        for (OrderItem item: items) {
            total += item.subTotal();
        }
        return total;
    }
}
