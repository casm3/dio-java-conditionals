/**
 * Author: Carlos Melo
 */
package src;
import java.util.Scanner;

public class MeasurementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter with the cloth size (S/M/L): ");
        String clothSize = scan.next();

        System.out.println(checkSize(clothSize));

    }
    protected static String checkSize(String size){
        String fullSize = null;
        switch (size) {
            case "M" -> {
                fullSize = "Medium";
            }
            case "S" -> {
                fullSize = "Small";
            }
            case "L" -> {
                fullSize = "Larger";
            }
        }
        return fullSize;
    }
}
