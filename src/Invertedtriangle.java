import java.util.Scanner;

public class Invertedtriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number of rows:");
        int rows= scanner.nextInt();
         for (int i=0;i<rows;i++){
             for (int j=0;j<i;j++) {
                 System.out.print("");
             }
                 for(int k=0;k<rows-i;k++){
                     System.out.print("*");
                 }
             System.out.println();
         }

    }
}
