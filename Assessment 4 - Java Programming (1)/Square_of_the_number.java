import java.util.Scanner;

public class Square_of_the_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            int square = number * number;
            System.out.println("Square of the number: " + square);
        } catch (Exception e) {
            System.out.println("Please enter valid data");
        }
    }
}