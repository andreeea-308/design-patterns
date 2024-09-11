package design_patterns.builder;

/**
 * TODO Steps to create a builder class:
 * 1. create a private constructor without parameters
 * 2. create a public static method called "createInstance" that returns a StudentBuilder instance using constructor defined at step 1
 * 3. declare all instance variables from target class (Student class in our case) and make them private
 * 4. For each instance variable create a public method with same name as the variable.
 *  - INPUT: method has one argument of variable's type. Assign argument value to variable
 *  - OUTPUT: return this instance of builder (StudentBuilder in our case)
 * 5. create a method called "build" that instantiate a new Student and pass as arguments, corresponding variable from StudentBuilder class.
 * <p>
 * Great job! Now you have a builder class. Let put this at work!
 * <p>
 * TODO Go back to MainBuilder class and in main method create a new Student using StudentBuilder. Spot the differences from creating Student using new keyword.
 */
public class StudentBuilder {
    private String name;
    private int age;
    private String description;
    private Double gradeAverageFirstYear;
    private Double gradeAverageSecondYear;
    private Double gradeAverageThirdYear;
    private Double gradeAverageFourthYear;

    private StudentBuilder() {
    }

    public static StudentBuilder createInstance() {
        return new StudentBuilder();
    }

    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }
    public StudentBuilder age(int age) {
        this.age= age;
        return this;
    }
    public StudentBuilder description(String description) {
        this.description=description;
        return this;
    }
    public StudentBuilder gradeAverageFirstYear(Double gradeAverageFirstYear){
        this.gradeAverageFirstYear = gradeAverageFirstYear;
        return this;
    }
    public StudentBuilder gradeAverageSecondYear(Double gradeAverageSecondYear){
        this.gradeAverageFirstYear = gradeAverageSecondYear;
        return this;
    }
    public StudentBuilder gradeAverageThirdYear(Double gradeAverageThirdYear){
        this.gradeAverageFirstYear = gradeAverageThirdYear;
        return this;
    }
    public StudentBuilder gradeAverageFourthYear(Double gradeAverageFourthYear){
        this.gradeAverageFirstYear = gradeAverageFourthYear;
        return this;
    }

    public Student build(){
        return new Student(this.name, this.age, this.description,this.gradeAverageFirstYear, this.gradeAverageSecondYear, this.gradeAverageThirdYear, this.gradeAverageFourthYear);
    }

    @Override
    public String toString() {
        return "StudentBuilder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                ", gradeAverageFirstYear=" + gradeAverageFirstYear +
                ", gradeAverageSecondYear=" + gradeAverageSecondYear +
                ", gradeAverageThirdYear=" + gradeAverageThirdYear +
                ", gradeAverageFourthYear=" + gradeAverageFourthYear +
                '}';
    }
}

