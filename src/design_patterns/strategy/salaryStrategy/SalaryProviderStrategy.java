package design_patterns.strategy.salaryStrategy;

import design_patterns.strategy.Employee;
import design_patterns.strategy.EmployeeType;

public interface SalaryProviderStrategy {
    int getsalary(Employee employee);
    boolean supports(EmployeeType type);
}
