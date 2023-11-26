import java.util.Scanner;

public class Student {
    private String name;
    private int regno;
    private int sub1;
    private int sub2;
    private int sub3;
    private int total;
    private String result;

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student name: ");
        name = input.nextLine();

        System.out.println("Enter student regno: ");
        regno = Integer.parseInt(System.in.readLine());

        System.out.println("Enter student sub1 marks: ");
        sub1 = Integer.parseInt(System.in.readLine());

        System.out.println("Enter student sub2 marks: ");
        sub2 = Integer.parseInt(System.in.readLine());

        System.out.println("Enter student sub3 marks: ");
        sub3 = Integer.parseInt(System.in.readLine());
    }

    public void resultCalculation() {
        total = sub1 + sub2 + sub3;

        if (sub1 >= 50 && sub2 >= 50 && sub3 >= 50) {
            result = "Pass";
        } else {
            result = "Fail";
        }
    }

    public void output() {
        System.out.println("Student name: " + name);
        System.out.println("Student regno: " + regno);
        System.out.println("Student sub1 marks: " + sub1);
        System.out.println("Student sub2 marks: " + sub2);
        System.out.println("Student sub3 marks: " + sub3);
        System.out.println("Student total marks: " + total);
        System.out.println("Student result: " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.input();
        student.resultCalculation();
        student.output();
    }
}