import java.util.Scanner;

public class Pattern_Right_Pascal_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Print the upper half of the Pascal's triangle
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }

        // Print the lower half of the Pascal's triangle
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        scanner.close();
    }
}