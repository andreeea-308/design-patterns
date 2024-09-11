package design_patterns.strategy.salaryStrategy;

import design_patterns.strategy.Employee;
import design_patterns.strategy.EmployeeType;

public class JuniorSalaryProvider implements SalaryProviderStrategy {
    private SalaryService salaryService;
    public JuniorSalaryProvider(SalaryService salaryService){
        this.salaryService = salaryService;
    }
    @Override
    public int getsalary(Employee employee) {
        return salaryService.getBaseSalary();
    }

    @Override
    public boolean supports(EmployeeType type) {
        return type == EmployeeType.JUNIOR;
    }
}
