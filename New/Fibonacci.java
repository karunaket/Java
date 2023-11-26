
import java.util.*;
public class Fibonacci {
    public static void main(String[] args)
    {
        int a = 0, b = 1, c, i;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();               // Taking input from the user...

        System.out.println(" " + a);
        System.out.println(" " + b);


        for(i = 2; i<count; ++i)
        {
            c = a + b;
            System.out.println(" " + c);
            a = b;
            b = c;
        }
    }
}
