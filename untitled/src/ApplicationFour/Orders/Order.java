package ApplicationFour.Orders;

import ApplicationFour.Client.Client;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private Client client;

    public List<OrderItem> items = new ArrayList<>();

    public Order(Client client, OrderStatus status) {
        Date data = Date.from(new Date().toInstant());
        this.moment = data;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        double sum = 0;
        for (OrderItem item : items){
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuffer stb = new StringBuffer();
        stb.append(client + "\n");
        stb.append("Date:" + dataFormat.format(moment)).append("\nStatus: " + status).append("\nItems: \n");
        for (OrderItem c : items){
            stb.append(c + "\n");
        }
        stb.append("Total: US$ " +total());
        return stb.toString();
    }
}