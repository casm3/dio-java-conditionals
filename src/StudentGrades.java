/**
 * Author: Carlos Melo
 */
package src;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter with the student grade: ");
        int grade = scan.nextInt();

        if (grade >= 7)
            System.out.println("Approved");
        else if (grade >= 5)
            System.out.println("Recovery");
        else
            System.out.println("Reproved");
    }
}
