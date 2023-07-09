package zooGame;

class Penguin extends Animal {
    private boolean canFly;

    public Penguin(String name, int age, boolean canFly) {
        super(name, "Penguin", age, "Polar Regions");
        this.canFly = canFly;
    }

    public boolean canFly() {
        return canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk!");
    }

    @Override
    public void eat(String food) {
        if (food.equals("fish")) {
            System.out.println(getName() + " happily eats " + food + ".");
            addToScore(4);
        } else {
            System.out.println(getName() + " is not interested in " + food + ".");
        }
    }

    @Override
    public void play() {
        System.out.println(getName() + " slides on the ice.");
        addToScore(2);
    }
}
