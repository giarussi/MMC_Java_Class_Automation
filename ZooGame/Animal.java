package Homework_ZooGame;

public class Animal {

	//Common method for all
    public int sleep() {
          System.out.println("Animal is Sleeping");
          return 1;
    }
    
    //Methods which can be overridden
    public int feed() {
          System.out.println("Animal is being fed");
          return 2;
    }

    public int makeSound() {
          System.out.println("Animal makes a sound");
          return 3;
    }


}
