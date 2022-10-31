package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    public void test_withdraw_500_from_account_with_1000(){
        Bank ba = new Bank();
        ba.setBalance(1000);

        double balance = 1000;
        double withdraw = 500;


    }

    @Test
    public void test_deposit_negative_500_from_account_with_1000(){
        Bank ba = new Bank();
        ba.setBalance(1000);

        double balance = 1000;
        double deposit = -500;
        double expectedValue = 1000;

        double accountValue = ba.putMoney(deposit);

        assertEquals(expectedValue, accountValue);

    }

    @Test
    public void test_deposit_500_from_account_with_1000(){
        Bank ba = new Bank();
        ba.setBalance(1000);

        double balance = 1000;
        double deposit = 500;
        double expectedValue = 1500;

        double accountValue = ba.putMoney(deposit);

        assertEquals(expectedValue, accountValue);

    }

}
