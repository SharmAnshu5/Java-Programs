import java.util.Scanner;

public class Armstrong_Number {
    static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += Math.pow(last, digits);
            temp = temp / 10;
        }
        return n == sum;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.print("Armstrong ");
        } else {
            System.out.print("Not Armstrong ");
        }
    }
}
