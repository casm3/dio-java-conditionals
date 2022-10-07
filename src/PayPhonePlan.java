/**
 * Author: Carlos Melo
 */
package src;
import java.util.Scanner;

public class PayPhonePlan {
    public static void main(String[] args) {
        System.out.println("""
                Select the desired pre-paid plan:\s
                M: MEDIA
                B: BASIC
                T: TURBO""");

        Scanner scan = new Scanner(System.in);
        String selectedPlan = scan.next();

        switch (selectedPlan) {
            case "B" -> System.out.println("100 - PHONE CALL MINUTES");
            case "M" -> System.out.println("""
                                100 - PHONE CALL MINUTES +
                                FREE WHATS APP AND INSTAGRAM""");
            case "T" -> System.out.println("""
                            100 - PHONE CALL MINUTES +
                            FREE WHATS APP AND INSTAGRAM +
                            5Gb ON YOUTUBE VIDEOS""");
        }

    }
}
