package interfaces;

import dtos.OrderDTO;

public interface PaymentInterface{
    void GeneratePayment(OrderDTO order);
    void ExpirePayment(OrderDTO order);
}
