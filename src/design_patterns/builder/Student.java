package design_patterns.builder;

public class Student {
    private String name;
    private int age;
    private String description;
    private Double gradeAverageFirstYear;
    private Double gradeAverageSecondYear;
    private Double gradeAverageThirdYear;
    private Double gradeAverageFourthYear;

    public Student(String name, int age, String description, Double gradeAverageFirstYear, Double gradeAverageSecondYear, Double gradeAverageThirdYear, Double gradeAverageFourthYear) {
        this.name = name;
        this.age = age;
        this.description = description;
        this.gradeAverageFirstYear = gradeAverageFirstYear;
        this.gradeAverageSecondYear = gradeAverageSecondYear;
        this.gradeAverageThirdYear = gradeAverageThirdYear;
        this.gradeAverageFourthYear = gradeAverageFourthYear;
    }

    @Override
    public String toString() {
        return "Student{" +
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
