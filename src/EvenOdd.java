import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter an integer:");
        int number=scanner.nextInt();
        number=Math.abs(number);
        String numStr=Integer.toString(number);
        System.out.println("Digitwise Even Odd");
        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);
            int digit = ch - '0';

            if (digit % 2 == 0) {
                System.out.println("Digit " + digit + " is Even");
            } else {
                System.out.println("Digit " + digit + " is Odd");
            }
        }

        scanner.close();

    }
}
