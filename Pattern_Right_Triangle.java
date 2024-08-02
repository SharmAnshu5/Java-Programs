public class Pattern_Right_Triangle {

        
        public static void Right_Triangle(int n) {
            for (int i = 0; i < n; i++) {
                Stars(i+1);
                System.out.println();
            }
        }
    

        private static void Stars(int count) {
            for (int i = 0; i < count; i++) {
                System.out.print("* ");
            }
        }
    
        
        public static void main(String[] args) {
            int n = 5;
            Right_Triangle(n);
        }
    }

