import java.util.Scanner;

class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}

class PrerequisiteNotMetException extends Exception {
    public PrerequisiteNotMetException(String message) {
        super(message);
    }
}

public class Assignment3P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enroll in Course: ");
            String course = scanner.nextLine();
            System.out.print("Prerequisite: ");
            String prerequisite = scanner.nextLine();

            if (course.equals("Advanced Java") && !prerequisite.equals("Core Java")) {
                throw new PrerequisiteNotMetException("Complete Core Java before enrolling in Advanced Java.");
            }
            if (course.equals("Advanced Java")) {
                throw new CourseFullException("Course is full.");
            }
            System.out.println("Enrollment Successful");
        } catch (CourseFullException | PrerequisiteNotMetException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
