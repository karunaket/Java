import java.util.Scanner;
public class armstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = input.nextInt();
        int originalNumber = number;
        int result = 0;
        while (number > 0) {
            int remainder = number % 10;
            result += Math.pow(remainder, 3);
            number /= 10;
        }
        if (originalNumber == result){
            System.out.println("1");
        }
    }
}