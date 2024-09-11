package design_patterns.strategy;

import design_patterns.strategy.salaryStrategy.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSalaryProvider {
    private SalaryProviderStrategyRezolver rezolver;
    public EmployeeSalaryProvider(SalaryProviderStrategyRezolver rezolver){
        this.rezolver = rezolver;
    }

    public int getSalary(Employee employee){
        return rezolver.resolve(employee.getType()).getsalary(employee);
    }

}

/**
 * TODO Please answer to following questions:
 * What this code do? Understand the algorithm for each case.
 * Is this code respecting Single Responsibility principle? Why?
 * It this code respecting Open Closed principle? Why?
 */
