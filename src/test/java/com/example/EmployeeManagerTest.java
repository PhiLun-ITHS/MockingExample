package com.example;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class EmployeeManagerTest {


    EmployeeRepositoryTest er = new EmployeeRepositoryTest();
    BankServiceTest bs = new BankServiceTest();
    EmployeeManager em = new EmployeeManager(er, bs);

    @Test
    void testEmployeesPaid (){
        int expectedResult = 1;
        int actualResult = em.payEmployees();

        assertThat(actualResult).isEqualTo(expectedResult);

    }

    @Test
    void testThrowRuntimeException() {
        BankServiceTest2 bank = new BankServiceTest2();
        EmployeeManagerTest em = new EmployeeManagerTest();


    }
}