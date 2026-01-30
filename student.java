import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<ArrayList<Integer>> allGrades = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // clear buffer

            System.out.print("\nEnter student name: ");
            String name = sc.nextLine();
            names.add(name);

            System.out.print("Enter number of subjects: ");
            int subjects = sc.nextInt();

            ArrayList<Integer> grades = new ArrayList<>();

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter grade for subject " + (j + 1) + ": ");
                grades.add(sc.nextInt());
            }

            allGrades.add(grades);
        }

        // Display Report
        System.out.println("\n===== Student Summary Report =====");

        for (int i = 0; i < names.size(); i++) {
            ArrayList<Integer> grades = allGrades.get(i);

            int sum = 0;
            int highest = grades.get(0);
            int lowest = grades.get(0);

            for (int g : grades) {
                sum += g;
                if (g > highest) highest = g;
                if (g < lowest) lowest = g;
            }

            double average = (double) sum / grades.size();

            System.out.println("\nStudent Name: " + names.get(i));
            System.out.println("Grades: " + grades);
            System.out.println("Average: " + average);
            System.out.println("Highest: " + highest);
            System.out.println("Lowest: " + lowest);
        }

        sc.close();
    }
}
