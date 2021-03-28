package com.example;

import java.util.List;

public class EmployeeRepositoryTest implements EmployeeRepository{

    @Override
    public List<Employee> findAll() {
        return List.of(new Employee("1", 2000));
    }

    @Override
    public Employee save(Employee e) {
        return null;
    }
}
