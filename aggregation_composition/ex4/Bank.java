package aggregation.ex4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Bank {

    public Bank() {
    }

    public void sortingAccounts(Client client) {
        Collections.sort(client.getAccounts());
    }

    public String getStatusAccount(Client client, long id) {
        String status = "";
        for (Account a : client.getAccounts()) {
            if (a.getId() == id) {
                if (a.isBlocked() == false) {
                    status = "unlocked";
                } else {
                    status = "locked";
                }
            }
        }
        return "account id: " + id + "; status: " + status + "\n";
    }

    public void lockAccount(Client client, long id) {
        for (Account a : client.getAccounts()) {
            if (a.getId() == id) {
                a.setBlocked(true);
            }
        }
    }

    public void unlockAccount(Client client, long id) {
        for (Account a : client.getAccounts()) {
            if (a.getId() == id) {
                a.setBlocked(false);
            }
        }
    }
public String getSumOfAccountBalances(Client client) {
        Double sum = 0.0;
        for(Account account : client.getAccounts()) {
            sum += account.getBalance();
        }
        return sum.toString();
}

public String getSumPositiveAccountsBalances(Client client) {
        Double sumPositive = 0.0;
        for (Account account : client.getAccounts()) {
            if(account.getBalance() > 0) {
                sumPositive += account.getBalance();
            }
        }
        return sumPositive.toString();
}

    public String getSumNegativeAccountsBalances(Client client) {
        Double sumNegative = 0.0;
        for (Account account : client.getAccounts()) {
            if(account.getBalance() < 0) {
                sumNegative += account.getBalance();
            }
        }
        return sumNegative.toString();
    }

}
