package simpleClasses.ex8;


import java.math.BigInteger;

public class Customer implements Comparable<Customer> {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private BigInteger numberCard;
    private BigInteger bankAccountNumber;

    public Customer(int id, String surname, String name, String patronymic, String address, BigInteger numberCard, BigInteger bankAccountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.numberCard = numberCard;
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumberCard(BigInteger numberCard) {
        this.numberCard = numberCard;
    }

    public void setBankAccountNumber(BigInteger bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public BigInteger getNumberCard() {
        return numberCard;
    }

    public BigInteger getBankAccountNumber() {
        return bankAccountNumber;
    }

    public String toString() {
        return "Id number: " + id + "\nSurname: " + surname + "\nName: " + name + "\nPatronymic: " + patronymic
                + "\nAdress: " + address + "\nNumber card: " + numberCard + "\nBank account number: " + bankAccountNumber + "\n";
    }

    @Override
    public int compareTo(Customer o) {
        return surname.compareTo(o.getSurname());
    }
}
