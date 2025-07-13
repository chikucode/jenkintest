public class MainApp {
    public static void main(String[] args) {
        int[] marks = {85, 78, 92};
        Student student = new Student("Alice", marks);

        double average = GradeCalculator.calculateAverage(student);
        String grade = GradeCalculator.getGrade(average);

        System.out.println("Student: " + student.getName());
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}
