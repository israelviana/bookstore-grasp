package models;

import dtos.OrderDTO;
import interfaces.PaymentInterface;

public class PaymentPIX implements PaymentInterface {
    @Override
    public void GeneratePayment(OrderDTO order) {

    }

    @Override
    public void ExpirePayment(OrderDTO order) {

    }
}
