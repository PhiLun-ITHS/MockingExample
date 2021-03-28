package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class EmployeeManagerTest {


    @Test
    void employeePaidTest () {
        EmployeeRepository mockedRepo = mock(EmployeeRepository.class);
        when(mockedRepo.findAll()).thenReturn(List.of(new Employee("1", 2000)));
        BankService mockedBankService = mock(BankService.class);
        EmployeeManager em = new EmployeeManager(mockedRepo, mockedBankService);

        int expectedResult = 1;
        int actualResult = em.payEmployees();
        assertThat(expectedResult).isEqualTo(actualResult);
    }

    @Test
    void throwExceptionPaidIsFalseTest () {
        EmployeeRepositoryTest employeeRepository = new EmployeeRepositoryTest();
        BankServiceExceptionTest bankService = new BankServiceExceptionTest();
        EmployeeManager em = new EmployeeManager(employeeRepository, bankService);

        int expectedResult = 0;
        int actualResult = em.payEmployees();
        assertThat(expectedResult).isEqualTo(actualResult);
    }

    /*
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
        BankServiceExceptionTest bank = new BankServiceExceptionTest();
        EmployeeManagerTest em = new EmployeeManagerTest();


    }

     */
}