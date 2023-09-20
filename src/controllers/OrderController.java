package controllers;
import dtos.OrderDTO;
import dtos.ClientDTO;
import services.Discount;

public class OrderController {
    public void createOrder(ClientDTO client, OrderDTO order){
        Discount discount = new Discount();
        discount.calculateDiscount(order);
        System.out.println("criando pedido");
    }

    public void cancelOrder(OrderDTO order){
        System.out.println("cancelando pedido");
    }

}
