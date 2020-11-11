package simpleClasses.ex8;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer(1, "Ivanov", "Ivan", "Ivanovich", "Belarus",
                new BigInteger("1000100020003001"), new BigInteger("10000200003000040010"));
        Customer customer2 = new Customer(2, "Ivanova", "Natasha", "Vladimirovna", "Poland",
                new BigInteger("1000100020003002"), new BigInteger("10000200003000040020"));
        Customer customer3 = new Customer(3, "Smirnov", "Aleksandr", "Vladimirovich", "Russia",
                new BigInteger("1000100020003003"), new BigInteger("10000200003000040025"));
        Customer customer4 = new Customer(4, "Jukova", "Olga", "Olegovna", "Latvia",
                new BigInteger("1000100020003004"), new BigInteger("10000200003000040030"));
        Customer customer5 = new Customer(5, "Masherov", "Vladimir", "Sergeevich", "Belarus",
                new BigInteger("1000100020003005"), new BigInteger("10000200003000040035"));
        Customer customer6 = new Customer(6, "Levchenko", "Pavel", "Vladimirovich", "Ukraine",
                new BigInteger("1000100020003006"), new BigInteger("10000200003000040040"));

        CustomerList customerList = new CustomerList();
        customerList.addCustomerToList(customer1);
        customerList.addCustomerToList(customer2);
        customerList.addCustomerToList(customer3);
        customerList.addCustomerToList(customer4);
        customerList.addCustomerToList(customer5);
        customerList.addCustomerToList(customer6);

        System.out.println("Unsorted customers list: ");
        customerList.printList(customerList.getCustomersList());

        System.out.println("Sorted customers list by surname: ");
        customerList.getSortedCustomersList();
        System.out.println(customerList.getCustomersList());

        System.out.println("A list of customers with a credit card number in a given range: ");
        ArrayList<Customer> listCardNumberInRang = customerList.getCustomersByCreditCardNumberInRange("1000100020003002", "1000100020003005");
        for (Customer c : listCardNumberInRang) {
            System.out.println(c);
        }
    }
}
