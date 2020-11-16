package aggregation.ex4;

import Decomposition.A;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client1 = new Client("Anna", "Brauer", "HB2202050");

        client1.addAccount(new Account(1000.50));
        client1.addAccount(new Account(500.00));
        client1.addAccount(new Account(-200.00));
        client1.addAccount(new Account(-50.50));

        System.out.println("Unsorted accounts: ");
        System.out.println(client1.toString());

        System.out.println("Get sorted list of accounts: ");
        bank.sortingAccounts(client1);
        System.out.println(client1);

        System.out.println("Check the status of the account by the id unblocked or blocked");
        System.out.println(bank.getStatusAccount(client1, client1.getAccounts().get(1).getId()));

        System.out.println("We will block the account by its id");
        bank.lockAccount(client1, client1.getAccounts().get(1).getId());
        System.out.println(bank.getStatusAccount(client1, client1.getAccounts().get(1).getId()));

        System.out.println("We will unblock the account by its id");
        bank.unlockAccount(client1, client1.getAccounts().get(1).getId());
        System.out.println(bank.getStatusAccount(client1, client1.getAccounts().get(1).getId()));

        String sum = bank.getSumOfAccountBalances(client1);
        System.out.println("Get the sum of account balances: " + sum);

        String sumPositive = bank.getSumPositiveAccountsBalances(client1);
        System.out.println("Get the sum of positive account balances: " + sumPositive);

        String sumNegative = bank.getSumNegativeAccountsBalances(client1);
        System.out.println("Get the sum of negative account balances: " + sumNegative);

    }
}
