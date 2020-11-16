package aggregation.ex4;

import java.util.ArrayList;

class Client {
    private String name;
    private String surname;
    private String passportID;
    private ArrayList<Account> accounts;

    public Client(String name, String surname, String passportID) {
        this.name = name;
        this.surname = surname;
        this.passportID = passportID;
        this.accounts = new ArrayList<Account>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassportID() {
        return passportID;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public String toString() {
        return "name: " + name + "; " + " surname: " + surname + "; " + " passport id: " + passportID + " accounts: " + accounts.toString() + "\n";
    }
}
