package org.example;

public class Bank {

    private double balance = 0;

    private double minBalance = 0;

    private String firstName = "";

    private String secondName = "";

    private double max = Double.MAX_VALUE;

    public Bank(double bal, double min, String first, String last){
        this.balance = bal;
        this.minBalance = min;
        this.firstName = first;
        this.secondName = last;
    }

    public Bank(){

    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double bal){
        this.balance = bal;
    }

    public double getMinBalance(){
        return this.minBalance;
    }

    public void setMinBalance(double bal){
        this.minBalance = bal;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String first){
        this.firstName = first;
    }

    public String getSecondName(){
        return this.secondName;
    }

    public void setSecondName(String second){
        this.secondName = second;
    }

    public double putMoney(double value){
        // if value is negative, make sure amount is less than MAX_VALUE
        try {
            if (value < 0) {
                throw new IllegalArgumentException("The amount cannot be a negative number.");
            }else{
                if((this.balance + value) <= max){
                    this.balance = this.balance + value;
                }
            }
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
        return this.balance - 5;
    }





}
