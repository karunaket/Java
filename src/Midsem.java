import java.lang.*;

class MyThreadRunnable implements Runnable {
    public void run() {
        System.out.println("HTML is a markup language");
        System.out.println("HTML is a markup language");
        System.out.println("HTML is a markup language");
    }
}

class MySecondRunnable implements Runnable {
    public void run() {
        System.out.println("Java is a programming language");
        System.out.println("Java is a programming language");
        System.out.println("Java is a programming language");
    }
}

public class Midsem {
    public static void main(String[] args) {
        MyThreadRunnable bullet1 = new MyThreadRunnable();
        Thread gun1 = new Thread(bullet1);

        MySecondRunnable bullet2 = new MySecondRunnable();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}