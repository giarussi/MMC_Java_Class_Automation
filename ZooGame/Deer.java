package Homework_ZooGame;

public class Deer extends Animal {
	@Override
    public int feed() {
          System.out.println("Deer is being fed");
          return 10;
    }

    @Override
    public int makeSound() {
          System.out.println("Deer makes a sound");
          return 11;
    }
    
    public int dances() {
          System.out.println("Deer Dances gracefully !");
          return 12;
    }

}
