//Write a Java program that prompts the user for an integer and
// then prints out all the prime numbers up to that Integer?
import java.util.Scanner;

public class PrimeNumber{

    public static void main(String[] args)
    {
        int x;
        int y;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        x=s.nextInt();
        for(int i=2;i<x;i++)
        {
            y=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                    y=1;
            }
            if(y==0)
                System.out.println(i);
        }
    }
}
