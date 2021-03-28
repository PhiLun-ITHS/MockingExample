package com.example;

public class BankServiceExceptionTest implements BankService{

    @Override
    public void pay(String id, double amount) {

        throw new RuntimeException();
    }
}

