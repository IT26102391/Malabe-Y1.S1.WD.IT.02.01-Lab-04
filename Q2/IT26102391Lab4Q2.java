import java.util.Scanner;

public class IT26102391Lab4Q2 {

    public static void main(String[] args) {

        double examMarks, labMarks;
        double examPercentage, labPercentage;
        double finalMarks;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the exam marks (out of 100): ");
        examMarks = input.nextDouble();

        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        System.out.print("Please enter the lab marks (out of 100): ");
        labMarks = input.nextDouble();

        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submissions. Terminating program.");
            return;
        }

        System.out.print("Please enter the exam percentage: ");
        examPercentage = input.nextDouble();

        if (examPercentage < 0 || examPercentage > 100) {
            System.out.println("Invalid input for exam percentage. Terminating program.");
            return;
        }

        System.out.print("Please enter the lab percentage: ");
        labPercentage = input.nextDouble();

        if (labPercentage < 0 || labPercentage > 100) {
            System.out.println("Invalid input for lab percentage. Terminating program.");
            return;
        }

        if (examPercentage + labPercentage != 100) {
            System.out.println("Percentages must add up to 100. Terminating program.");
            return;
        }

        finalMarks = (examMarks * examPercentage / 100)
                   + (labMarks * labPercentage / 100);

        System.out.println("Final marks: " + finalMarks);

    }
}
