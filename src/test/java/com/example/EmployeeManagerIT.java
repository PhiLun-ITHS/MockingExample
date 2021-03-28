package com.example;
import emRepo.EmployeeRepo;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class EmployeeManagerIT {

    EmployeeRepo repo = new EmployeeRepo();
    BankService service = mock(BankService.class);
    EmployeeManager man = new EmployeeManager(repo, service);

    @Test
    void findAndPayEmployee() {
        Employee e = new Employee("1", 500);
        repo.save(e);

        int employeePaid = man.payEmployees();
        assertThat(employeePaid).isEqualTo(1);
    }

}
