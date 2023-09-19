package controllers;
import dtos.OrderDTO;
import dtos.ClientDTO;

public class OrderController {
    public void createOrder(ClientDTO client, OrderDTO order){
        System.out.println("criando pedido");
    }

    public void cancelOrder(OrderDTO order){
        System.out.println("cancelando pedido");
    }

}
