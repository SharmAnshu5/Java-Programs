public class Pattern_Left_Triangle
 {
    public static void Left_Triangle(int n) {
                for (int i = 0; i < n; i++) {
                    for (int j = 2 * (n - i); j >= 0; j--) {
                        System.out.print(" ");
                   }
                    for (int j = 0; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        
            public static void main(String[] args) {
                int n = 5;
                Left_Triangle(n);
            }
}
