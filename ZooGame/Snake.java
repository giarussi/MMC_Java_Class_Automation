package Homework_ZooGame;

public class Snake extends Animal {
    @Override
    public int feed() {
          System.out.println("Snake is being fed");
          return 16;
    }

    @Override
    public int makeSound() {
          System.out.println("Snake makes a sound");
          return 17;
    }
    
    public int hangs() {
          System.out.println("Snake hangs on a tree.");
          return 18;
    }

}
