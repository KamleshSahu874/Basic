import java.util.Scanner;
import java.util.HashMap;

public class LetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        word = word.toLowerCase();

        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount.put(ch, letterCount.getOrDefault(ch, 0) + 1);
            }
        }
        System.out.println("Letter counts:");
        for (char ch : letterCount.keySet()) {
            System.out.println(ch + ": " + letterCount.get(ch));
        }

        scanner.close();
    }
}

