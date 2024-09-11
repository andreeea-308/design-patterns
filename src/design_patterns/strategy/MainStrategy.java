package design_patterns.strategy;

import design_patterns.strategy.salaryStrategy.*;

public class MainStrategy {
    public static void main(String[] args) {
        SalaryProviderStrategyRezolver rezolver = new SalaryProviderStrategyRezolver();

        EmployeeSalaryProvider employeeSalaryProvider = new EmployeeSalaryProvider(rezolver);

        Employee juniorEmployee = new Employee(EmployeeType.JUNIOR, 0);
        System.out.println(employeeSalaryProvider.getSalary(juniorEmployee));

        Employee middleEmployee = new Employee(EmployeeType.MIDDLE, 3);
        System.out.println(employeeSalaryProvider.getSalary(middleEmployee));

        Employee seniorEmployee = new Employee(EmployeeType.SENIOR, 3);
        System.out.println(employeeSalaryProvider.getSalary(seniorEmployee));

        Employee directorEmployee = new Employee(EmployeeType.DIRECTOR, 7);
        System.out.println(employeeSalaryProvider.getSalary(directorEmployee));
    }
}
