import java.util.Scanner;

public class Pattern_Left_Pascal_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Print the upper half of the left-aligned Pascal's triangle
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // Print the lower half of the left-aligned Pascal's triangle
        for (int i = rows; i >= 1; i--) {
            // Print leading spaces
            for (int j = i; j <= rows; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        scanner.close();
    }
}
