import java.lang.*;

class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("HTML is a markup language");
    System.out.println("HTML is a markup language");
    System.out.println("HTML is a markup language");
  }
}

class MySecondThread extends Thread {
  @Override
  public void run() {
    System.out.println("Java is a programming language");
    System.out.println("Java is a programming language");
    System.out.println("Java is a programming language");
  }
}

public class MultithreadingByExtendingThreadClass {
  public static void main(String[] args) {
    MyThread thread1 = new MyThread();
    MySecondThread thread2 = new MySecondThread();

    thread1.start();
    thread2.start();
  }
}