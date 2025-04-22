
import java.util.Scanner;

public class FindVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.println("Vowels in the word:");
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (isVowel(ch)) {
                System.out.println("Position " + (i + 1) + ": " + ch);
            }
        }
        scanner.close();
    }
    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
