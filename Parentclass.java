
class Animal {
  void eat() {
    System.out.println("Eating...");
  }
}


class Cat extends Animal {
  void meow() {
    System.out.println("Meowing...");
  }
}


class Dog extends Animal {
  void bark() {
    System.out.println("Barking...");
  }
}


public class Main {
  public static void main(String[] args) {
    Cat myCat = new Cat();
    myCat.eat(); // Inherited method from Animal class
    myCat.meow(); // Method specific to Cat class

    Dog myDog = new Dog();
    myDog.eat(); // Inherited method from Animal class
    myDog.bark(); // Method specific to Dog class
  }
}
