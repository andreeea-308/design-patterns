package design_patterns.strategy.salaryStrategy;

public class SalaryService {
    private static SalaryService salaryService = new SalaryService();
    private static final int BASE_SALARY = 1000;
    private SalaryService(){
    }
    public static SalaryService getInstance(){
        return salaryService;
    }
    public int getBaseSalary(){
        return BASE_SALARY;
    }
}
