import java.util.Scanner;

public class Asciivalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        int ascii = (int) ch; // type casting char to int

        System.out.println("ASCII value of '" + ch + "' is: " + ascii);

        scanner.close();
    }
}
