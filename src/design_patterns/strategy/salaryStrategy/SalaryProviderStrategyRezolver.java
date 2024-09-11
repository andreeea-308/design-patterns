package design_patterns.strategy.salaryStrategy;

import design_patterns.strategy.EmployeeType;

import java.util.ArrayList;
import java.util.List;

public class SalaryProviderStrategyRezolver {
    private List<SalaryProviderStrategy> salaryProviderStrategies = new ArrayList<>();

    public SalaryProviderStrategyRezolver() {

        SalaryService salaryServiceInstance = SalaryService.getInstance();

        salaryProviderStrategies.add(new JuniorSalaryProvider(salaryServiceInstance));
        salaryProviderStrategies.add(new MiddleSalaryProvider(salaryServiceInstance));
        salaryProviderStrategies.add(new SeniorSalaryProvider(salaryServiceInstance));
        salaryProviderStrategies.add(new DirectorSalaryProvider(salaryServiceInstance));
    }

    public SalaryProviderStrategy resolve(EmployeeType type) {
        return salaryProviderStrategies
                .stream().filter(it -> it.supports(type))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No strategy found for this type of employee" + type));
    }
}
