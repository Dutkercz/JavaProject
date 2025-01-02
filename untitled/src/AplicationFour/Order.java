package AplicationFour;

import ApplicationFour.Orders.OrderItem;
import ApplicationFour.Orders.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Order {
   private Date moment;

   private OrderStatus status;

   List<OrderItem> orderList = new ArrayList<>();

}
