package aggregation.ex4;

import java.util.Comparator;

class Account implements Comparable<Account> {
    private long id;
    private Double balance;
    private boolean isBlocked;

    public Account(double balance) {
        this.balance = balance;
        this.id = (long) (Math.random() * 10000000000000000L);
        this.isBlocked = false;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public String getStatusAccount() {
        String status;
        if (isBlocked == false) {
            status = "unlocked";
        } else {
            status = "locked";
        }
        return "account id: " + id + ";    balance: " + balance + "; status: " + status;
    }


    @Override
    public int compareTo(Account a) {
        return balance.compareTo(a.getBalance());
    }

    @Override
    public String toString() {
        return balance.toString();
    }
}

