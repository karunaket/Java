public class OverloadingExample {
  // Constructor Overloading

  public OverloadingExample()
  {
    System.out.println("Constructor with no arguments");
  }
  public OverloadingExample(int num)
  {
    System.out.println("Constructor with num" +  num);
  }
  public OverloadingExample(String name)
  {
    System.out.println("Constructor with name" + name);
  }

  // Method Overloading

  public int add(int a, int b)
  {
    return a + b;
  }
  public double add(double a, double b)
  {
    return a + b;
  }
  public String add(String a, String b)
  {
    return a + b;
  }

  public static void main(String[] args)
  {
    //Constructor Overloading
    OverloadingExample obj1 = new OverloadingExample();
    OverloadingExample obj2 = new OverloadingExample(63);
    OverloadingExample obj3 = new OverloadingExample("Java");

    //Method Overloading
    OverloadingExample Example = new OverloadingExample();
    int result1 = Example.add(2,3);
    double result2 = Example.add(2.5,3.3);
    String result3 = Example.add("Hi","Hello");

    System.out.println("Additional results:");
    System.out.println("Result 1: " + result1);
    System.out.println("Result 2: " + result2);
    System.out.println("Result 3: " + result3);
  }
}