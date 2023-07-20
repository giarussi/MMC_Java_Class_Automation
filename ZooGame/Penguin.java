package Homework_ZooGame;

public class Penguin extends Animal {

    @Override
    public int feed() {
          System.out.println("Penguin is being fed");
          return 13;
    }

    @Override
    public int makeSound() {
          System.out.println("Penguin makes a sound");
          return 14;
    }
    
    public int walks() {
          System.out.println("Penguin walks");
          return 15;
    }

}
