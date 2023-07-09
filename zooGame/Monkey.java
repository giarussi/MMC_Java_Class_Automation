package zooGame;

class Monkey extends Animal {
    private boolean canClimb;

    public Monkey(String name, int age, boolean canClimb) {
        super(name, "Monkey", age, "Forest");
        this.canClimb = canClimb;
    }

    public boolean canClimb() {
        return canClimb;
    }

    @Override
    public void makeSound() {
        System.out.println("Ooh ooh ah ah!");
    }

    @Override
    public void eat(String food) {
        if (food.equals("banana")) {
            System.out.println(getName() + " happily eats " + food + ".");
            addToScore(4);
        } else {
            System.out.println(getName() + " is not interested in " + food + ".");
        }
    }

    @Override
    public void play() {
        System.out.println(getName() + " swings from branch to branch.");
        addToScore(3);
    }
}
