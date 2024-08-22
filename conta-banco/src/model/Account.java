package model;

public class Account {

    private Long accountNumber;

    private String agency;

    private String customer;

    private double amount;


    public Account() {
    }

    public Account(Long accountNumber, String agency, String customer, Float amount) {
        this.accountNumber = accountNumber;
        this.agency = agency;
        this.customer = customer;
        this.amount = amount;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", agency=" + agency + ", customer=" + customer + ", amount="
                + amount + "]";
    }

}
