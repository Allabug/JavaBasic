package com.epamlearn.javabasics.module5.ex2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();

        Product product1 = new Product("Milk", "16935745", new Price(new BigDecimal("2.5"), "BYN"));
        Product product2 = new Product("Bread", "16935792", new Price(new BigDecimal("1.75"), "BYN"));
        Product product3 = new Product("Cheese", "16935788", new Price(new BigDecimal("6.40"), "BYN"));
        Product product4 = new Product("Yogurt", "16935733", new Price(new BigDecimal("1.20"), "BYN"));
        Product product5 = new Product("Oil", "16935777", new Price(new BigDecimal("3.60"), "BYN"));

        payment.addItemToPayment(new Payment.PaymentItem(product1, 2));
        payment.addItemToPayment(new Payment.PaymentItem(product2, 4));
        payment.addItemToPayment(new Payment.PaymentItem(product3, 6));
        payment.addItemToPayment(new Payment.PaymentItem(product4, 2));
        payment.addItemToPayment(new Payment.PaymentItem(product5, 1));

        System.out.println("view content Payment: ");
        payment.printPaymentContent();
        payment.calculateTotalPrice();
        System.out.println("Total price = " + payment.calculateTotalPrice());
    }
}
