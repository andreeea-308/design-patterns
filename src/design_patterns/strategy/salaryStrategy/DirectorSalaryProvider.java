package design_patterns.strategy.salaryStrategy;

import design_patterns.strategy.Employee;
import design_patterns.strategy.EmployeeType;

public class DirectorSalaryProvider implements SalaryProviderStrategy {
    private SalaryService salaryService;

    public DirectorSalaryProvider(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    @Override
    public int getsalary(Employee employee) {
        return salaryService.getBaseSalary() * employee.getYearsOfExperience();
    }

    @Override
    public boolean supports(EmployeeType type) {
        return type == EmployeeType.DIRECTOR;
    }
}
