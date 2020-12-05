package com.epamlearn.javabasics.module5.ex2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Payment {

    private List<PaymentItem> paymentItems = new ArrayList<>();

    public void addItemToPayment(PaymentItem... paymentItems) {
        for (PaymentItem p : paymentItems) {
            this.paymentItems.add(p);
        }
    }

    public static class PaymentItem {

        private int productsAmount;
        private Product product;

        public PaymentItem(Product product, int productsAmount) {
            this.product = product;
            this.productsAmount = productsAmount;
        }

        public int getProductsAmount() {
            return productsAmount;
        }

        public Product getProduct() {
            return product;
        }

        public void setProductsAmount(int productsAmount) {
            this.productsAmount = productsAmount;
        }

        @Override
        public String toString() {
            return "PaymentItem{" +
                    "productsAmount=" + productsAmount +
                    ", " + product + '}';
        }
    }

    public void printPaymentContent() {
        for (PaymentItem p : this.paymentItems) {
            System.out.println(p);
        }
    }

    public String calculateTotalPrice() {
        BigDecimal sumTotal = BigDecimal.ZERO;
        for (PaymentItem p : paymentItems) {
            BigDecimal amount = BigDecimal.valueOf(p.getProductsAmount());
            sumTotal = sumTotal.add(p.product.getProductPrice().getPriceProduct().multiply(amount));
        }
        return sumTotal.toString() + " BYN";
    }

    public void setPaymentItems(List<PaymentItem> paymentItems) {
        this.paymentItems = paymentItems;
    }

    public List<PaymentItem> getPaymentItems() {
        return paymentItems;
    }

}
