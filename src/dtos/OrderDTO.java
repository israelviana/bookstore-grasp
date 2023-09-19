package dtos;

import interfaces.PaymentInterface;

import java.util.Date;

public class OrderDTO{
    public OrderDTO(BookDTO[] book, double totalValue, Date orderDate, ClientDTO client, String statusOrder, PaymentInterface payment) {
        this.book = book;
        this.totalValue = totalValue;
        this.orderDate = orderDate;
        this.client = client;
        this.statusOrder = statusOrder;
        this.payment = payment;
    }

    private BookDTO[] book;
    private PaymentInterface payment;
    private double totalValue;
    private Date orderDate;
    private ClientDTO client;
    private String statusOrder;

    public BookDTO[] getBook() {
        return book;
    }

    public void setPayment(PaymentInterface payment) {
        this.payment = payment;
    }

    public PaymentInterface getPayment() {
        return payment;
    }

    public void setBook(BookDTO[] book) {
        this.book = book;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public String getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(String statusOrder) {
        this.statusOrder = statusOrder;
    }
}
