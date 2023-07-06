package Homework_ZooGame;

public class Lion extends Animal {
    @Override
    public int feed() {
          System.out.println("Lion is being fed");
          return 4;
    }
    
    @Override
    public int makeSound() {
          System.out.println( "Lion makes a sound");
          return 5;
    }
    
    public int hunt() {
          System.out.println("Lion Hunts");
          return 6;
    }

}
