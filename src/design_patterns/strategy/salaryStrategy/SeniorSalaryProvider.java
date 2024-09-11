package design_patterns.strategy.salaryStrategy;

import design_patterns.strategy.Employee;
import design_patterns.strategy.EmployeeType;

public class SeniorSalaryProvider implements SalaryProviderStrategy{
    private SalaryService salaryService;
    public SeniorSalaryProvider(SalaryService salaryService){
        this.salaryService = salaryService;
    }
    @Override
    public int getsalary(Employee employee) {
        return salaryService.getBaseSalary() + (employee.getYearsOfExperience() * 200);
    }

    @Override
    public boolean supports(EmployeeType type) {
        return type == EmployeeType.SENIOR;
    }
}
