import java.util.Scanner;

public class Pattern_Left_Pascal_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

       
        for (int i = 1; i <= rows; i++) {
           
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
           
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

       
        for (int i = rows; i >= 1; i--) {
            
            for (int j = i; j <= rows; j++) {
                System.out.print(" ");
            }
           
            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        scanner.close();
    }
}
