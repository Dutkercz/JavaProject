package Anotacoes.Enumeration.Program;

import Anotacoes.Enumeration.Entites.Order;
import Anotacoes.Enumeration.Enum.OrderStatus;

import java.util.Date;

public class Anotacoes21 {
    public static void main(String[] args) {

        //Enumerações

        //Ciclo de vida de um pedido.

        //PendingPayment > Processing > Shipped > Delivered

        Order novoPedido = new Order(1092, new Date(), OrderStatus.PENDING_PAYMENTS);

        System.out.println(novoPedido );

        OrderStatus orderStatus = OrderStatus.DELIVERED;

        OrderStatus orderStatus1 = OrderStatus.valueOf("DELIVERED");

        System.out.println(orderStatus);
        System.out.println(orderStatus1);


    }
}
