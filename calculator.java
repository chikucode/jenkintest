public class GradeCalculator {

    public static double calculateAverage(Student student) {
        int[] marks = student.getMarks();
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total / (double) marks.length;
    }

    public static String getGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }
}
