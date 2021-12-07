//Write a Java program to display the following star pattern.
import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" enter the number of row : ");
        int row = s.nextInt();
        System.out.print("enter the number of column : ");
        int column = s.nextInt();

        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= column; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}