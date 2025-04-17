import java.sql.SQLOutput;
public class Arraysum {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println("Sum of arr1: " + Arraysum(arr1));
        System.out.println("Sum of arr2: " + Arraysum(arr2));
    }

    public static int Arraysum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        while (sum >= 10) {
            int temp = 0;
            while (sum > 0) {
                temp += sum % 10;
                sum /= 10; // fixed line
            }
            sum = temp;
        }

        return sum;
    }
}
