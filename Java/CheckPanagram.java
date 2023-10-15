import java.util.Scanner;

public class CheckPanagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toUpperCase(); // Convert to uppercase for consistency
        scanner.close();

        boolean isPangram = isPangram(sentence);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26]; // Represents the 26 letters from A to Z

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'A';
                alphabet[index] = true;
            }
        }

        for (boolean letterUsed : alphabet) {
            if (!letterUsed) {
                return false; // If any letter is not used, it's not a pangram
            }
        }

        return true;
    }
}

/*
 * Enter a sentence: The quick brown fox jumps over the lazy dog
    The input is a pangram.
 */