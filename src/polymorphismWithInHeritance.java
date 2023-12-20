class Animal
{
  public void makeSound()
  {
    System.out.println("Sound");
  }
}
class Dog extends Animal{
  public void makeSound()
  {
    System.out.println("Bark");
  }
}
class Cat extends Animal{
  public void makeSound()
  {
    System.out.println("Meow");
  }
}

public class polymorphismWithInHeritance {
  public static void main(String[] args)
  {
    Animal a = new Animal();
    Animal b = new Dog();
    Animal c = new Cat();

    a.makeSound();
    b.makeSound();
    c.makeSound();
  }
}