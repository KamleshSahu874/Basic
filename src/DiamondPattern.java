import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an odd number for the number of lines: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number for a perfect diamond shape.");
        } else {
            int mid = n / 2;

            for (int i = 0; i <= mid; i++) {
                for (int j = 0; j < mid - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = mid - 1; i >= 0; i--) {
                for (int j = 0; j < mid - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
