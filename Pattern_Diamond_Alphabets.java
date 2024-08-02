import java.util.Scanner;

public class Pattern_Diamond_Alphabets {
    public static void main(String[] args) {
        char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                'W', 'X', 'Y', 'Z' };
        int letterNumber = 0;
        String[] diamond = new String[26]; // array of strings

        System.out.print("Enter a Character between A to Z: ");
        Scanner scanner = new Scanner(System.in);

        try {
            char userLetter = scanner.next("[A-Z]").charAt(0);

            // Find the position of the user's letter in the alphabet
            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == userLetter) {
                    letterNumber = i;
                    break;
                }
            }

            // Construct the diamond pattern
            for (int i = 0; i <= letterNumber; i++) {
                diamond[i] = "";
                // Add leading spaces
                for (int j = 0; j < letterNumber - i; j++) {
                    diamond[i] += " ";
                }

                // Add the letter
                diamond[i] += letters[i];

                // Add spaces between letters (if not the first letter)
                if (letters[i] != 'A') {
                    for (int j = 0; j < 2 * i - 1; j++) {
                        diamond[i] += " ";
                    }
                    diamond[i] += letters[i];
                }

                // Print the row
                System.out.println(diamond[i]);
            }

            // Print the second half of the diamond (in reverse order)
            for (int i = letterNumber - 1; i >= 0; i--) {
                System.out.println(diamond[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}