package com.portfolio.hr_system.service;

import com.portfolio.hr_system.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public List<Employee> findAll() {
        return List.of();
    }

    @Override
    public Employee findById(int theId) {
        return null;
    }

    @Override
    public Employee save(Employee theEmployee) {
        return null;
    }

    @Override
    public void deleteById(int theId) {

    }
}
