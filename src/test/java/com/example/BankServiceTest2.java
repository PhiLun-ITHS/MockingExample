package com.example;

public class BankServiceTest2 implements BankService{
    @Override
    public void pay(String id, double amount) throws RuntimeException{

        throw new RuntimeException();
    }
}

