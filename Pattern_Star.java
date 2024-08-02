public class Pattern_Star {

     
    public static void Pyramid(int n) {
        for (int i = 0; i < n; i++) {
            Spaces(n - i - 1);
            Stars(i + 1);
            System.out.println();
        }
    }

   
    private static void Spaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

   
    private static void Stars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
    }

   
    public static void main(String[] args) {
        int n = 5;
        Pyramid(n);
    }
}