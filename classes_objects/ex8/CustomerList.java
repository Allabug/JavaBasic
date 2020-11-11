package simpleClasses.ex8;

import Decomposition.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CustomerList {
    private ArrayList<Customer> customersList = new ArrayList<>();

    public ArrayList<Customer> getCustomersList() {
        return customersList;
    }

    public CustomerList addCustomerToList(Customer customer) {
        customersList.add(customer);
        return this;
    }

    public void getSortedCustomersList() {
        Collections.sort(customersList);
    }

    public ArrayList<Customer> getCustomersByCreditCardNumberInRange(String min, String max) {
        ArrayList<Customer> newList = new ArrayList<>();
        for(Customer c : customersList) {
            if(c.getNumberCard().toString().compareTo(min) > 0 && c.getNumberCard().toString().compareTo(max) < 0) {
                newList.add(c);
            }
        }
        return newList;
    }

    public void printList(ArrayList<Customer> customersList) {
        for (Customer c : customersList) {
            System.out.println(c);
        }
    }
}
