public class MaxInt {
    public static void main(String[] args) {
        int[] arr1 = {10, 25, 3, 7};
        int[] arr2 = {5, 60, 17, 9};

        int max = Integer.MIN_VALUE;

        for (int num : arr1) {
            if (num > max) {
                max = num;
            }
        }

        // Check max in arr2
        for (int num : arr2) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum value from both arrays: " + max);
    }
}

