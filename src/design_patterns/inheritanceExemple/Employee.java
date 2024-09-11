package design_patterns.inheritanceExemple;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
        System.out.println("Employee created!");
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    protected void doSomeWork(){
        System.out.println("Work done!");
    }
}

