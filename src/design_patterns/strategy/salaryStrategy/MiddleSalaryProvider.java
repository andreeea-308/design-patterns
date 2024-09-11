package design_patterns.strategy.salaryStrategy;

import design_patterns.strategy.Employee;
import design_patterns.strategy.EmployeeType;

public class MiddleSalaryProvider implements SalaryProviderStrategy {
    private SalaryService salaryService;
    public MiddleSalaryProvider(SalaryService salaryService){
        this.salaryService = salaryService;
    }
    @Override
    public int getsalary(Employee employee) {
        return salaryService.getBaseSalary() + 100;
    }

    @Override
    public boolean supports(EmployeeType type) {
        return type == EmployeeType.MIDDLE;
    }
}
