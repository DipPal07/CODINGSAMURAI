import java.util.Scanner;

public class studentgradeCalculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Prompt user to input grades
    System.out.println("Enter your grades for each course:");
    System.out.print("Assignment 1 (out of 100): ");
    double assignment1 = scanner.nextDouble();
    System.out.print("Assignment 2 (out of 100): ");
    double assignment2 = scanner.nextDouble();
    System.out.print("Midterm exam (out of 100): ");
    double midterm = scanner.nextDouble();
    System.out.print("Final exam (out of 100): ");
    double finalExam = scanner.nextDouble();

    // Calculating final grade
    double finalGrade = calculateFinalGrade(
      assignment1,
      assignment2,
      midterm,
      finalExam
    );

    // Determining letter grade
    String letterGrade = determineLetterGrade(finalGrade);

    // Display final grade and letter grade
    System.out.println("Your final grade is: " + finalGrade);
    System.out.println("Your letter grade is: " + letterGrade);
  }

  public static double calculateFinalGrade(
    double assignment1,
    double assignment2,
    double midterm,
    double finalExam
  ) {
    // Define weights for each component
    // These lines of code are defining the weights for each component of the final grade
    // calculation. Each component (assignment 1, assignment 2, midterm exam, and final exam)
    // contributes a certain percentage to the final grade.
    double assignmentWeight = 0.25;
    double midtermWeight = 0.25;
    double finalExamWeight = 0.5;

    // Calculate weighted average
    double weightedAverage =
      (
        (assignment1 * assignmentWeight) +
        (assignment2 * assignmentWeight) +
        (midterm * midtermWeight) +
        (finalExam * finalExamWeight)
      );
    return weightedAverage;
  }

  public static String determineLetterGrade(double finalGrade) {
    if (finalGrade >= 90) {
      return "A";
    } else if (finalGrade >= 80) {
      return "B";
    } else if (finalGrade >= 70) {
      return "C";
    } else if (finalGrade >= 60) {
      return "D";
    } else {
      return "F";
    }
  }
}
