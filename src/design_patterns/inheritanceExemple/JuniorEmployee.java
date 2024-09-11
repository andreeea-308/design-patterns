package design_patterns.inheritanceExemple;

public class JuniorEmployee extends Employee{
    private int yearsOfExperience;
    public JuniorEmployee(String name, int yearsOfExperience){
        super(name);
        super.doSomeWork();
        this.yearsOfExperience = yearsOfExperience;
        System.out.println("Junior employee created!");
    }
}

