package design_patterns.builder;

public class MainBuilder {
    public static void main(String[] args) {
        Student student_1 = new Student("Andrei", 29, "This student graduated, has all grades not null.", 6.5, 6.5, 6.5, 6.5);
        System.out.println(student_1);
        Student student_2 = new Student("Andreea", 29, "This student only graduated first year.", 7.5, null, null, null);
        System.out.println(student_2);
        Student student_2_UsingBuilder = StudentBuilder.createInstance()
                .name("Andreea")
                .age(29)
                .description("This student only graduated first year.")
                .gradeAverageFirstYear(7.5).build();
        System.out.println(student_2_UsingBuilder);
        // TODO: create student_2 using StudentBuilder
    }
}
