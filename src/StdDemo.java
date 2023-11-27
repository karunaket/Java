import java.util.Scanner;

public class Student
{
  String name;
  String Stu_id;
  private int mark1;
  private int mark2;
  private int score;

  public Student(String initname, String initid)
  {
    name = initname;
    Stu_id = initid;
  }
  public void setMarks(int m1, int m2)
  {
    mark1 = m1;
    mark2 = m2;
  }
  public void calculateScore()
  {
    score = (mark1 + mark2)/2;
  }
  public void display()
  {
    System.out.println("Name: " + name);
    System.out.println("Id: " + Stu_id);
    System.out.println("Score: " + score);
  }
}
class StdDemo
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Input Student name, ID:");
    String s = in.next();
    String id = in.next();
    Student stu = new Student(s, id);
    int m1 = in.nextInt();
    int m2 = in.nextInt();
    stu.setMarks(m1, m2);

    stu.calculateScore();
    stu.display();
    in.close();
  }
}