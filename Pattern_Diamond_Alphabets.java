import java.util.Scanner;

public class Pattern_Diamond_Alphabets {
    public static void main(String[] args) {
        char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                'W', 'X', 'Y', 'Z' };
        int letter = 0;
        String[] diamond = new String[26]; // array of strings

        System.out.print("Enter a Character between A to Z: ");
        Scanner scanner = new Scanner(System.in);

        try {
            char userLetter = scanner.next("[A-Z]").charAt(0);

            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == userLetter) {
                    letter = i;
                    break;
                }
            }

        
            for (int i = 0; i <= letter; i++) {
                diamond[i] = "";
            
                for (int j = 0; j < letter - i; j++) {
                    diamond[i] += " ";
                }

        
                diamond[i] += letters[i];

    
                if (letters[i] != 'A') {
                    for (int j = 0; j < 2 * i - 1; j++) {
                        diamond[i] += " ";
                    }
                    diamond[i] += letters[i];
                }

        
                System.out.println(diamond[i]);
            }

            for (int i = letter - 1; i >= 0; i--) {
                System.out.println(diamond[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
