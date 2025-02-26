package com.npci.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PayProcessor {

    private SalaryCalculator salaryCalculator;

    private Employee employee;

    @Autowired
    public PayProcessor(SalaryCalculator salaryCalculator, Employee employee){

        System.out.println("In Constructor of PayProcessor Class - Object getting created ");

        this.salaryCalculator = salaryCalculator;
        this.employee = employee;
    }

    public void processSalaries(){
        salaryCalculator.calculateSalary();
        employee.setId(100);
        System.out.println("In processSalaries");
    }

}
