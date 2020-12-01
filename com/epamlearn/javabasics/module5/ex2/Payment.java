package com.epamlearn.javabasics.module5.ex2;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Payment {

    private Price totalPrice = new Price();
    private PaymentItem paymentItem;
    private ArrayList<PaymentItem> paymentItems = new ArrayList<>();

    public Payment() {
    }

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

    public void calculateTotalPrice() {
        BigDecimal sumTotal = BigDecimal.ZERO;
        for (PaymentItem p : paymentItems) {
            sumTotal = sumTotal.add(p.product.getProductPrice().getPriceBigDecimal());
        }
        this.totalPrice.setPrice(sumTotal.toString());
        this.totalPrice.setCurrency("BYN");
    }

    public void setTotalPrice(Price totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setPaymentItem(PaymentItem paymentItem) {
        this.paymentItem = paymentItem;
    }

    public void setPaymentItems(ArrayList<PaymentItem> paymentItems) {
        this.paymentItems = paymentItems;
    }

    public Price getTotalPrice() {
        return totalPrice;
    }

    public PaymentItem getPaymentItem() {
        return paymentItem;
    }

    public ArrayList<PaymentItem> getPaymentItems() {
        return paymentItems;
    }

}
