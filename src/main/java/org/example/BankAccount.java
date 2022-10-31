package org.example;

public class BankAccount extends Bank {


    private String sortCode;
    private String accountNumber;
    private String accountType;
    private double interestRate;
    private double max = Double.MAX_VALUE;

    public BankAccount() {

    }

    public BankAccount(double bal, double minbal, String first, String second, String sort, String account,
                       String type, double interest) {
        super(bal, minbal, first, second);
        this.sortCode = sort;
        this.accountNumber = account;
        this.accountType = type;
        this.interestRate = interest;
    }

}
