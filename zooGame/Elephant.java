package zooGame;

class Elephant extends Animal {
    private int trunkLength;

    public Elephant(String name, int age, int trunkLength) {
        super(name, "Elephant", age, "Jungle");
        this.trunkLength = trunkLength;
    }

    public int getTrunkLength() {
        return trunkLength;
    }

    @Override
    public void makeSound() {
        System.out.println("Trumpet!");
    }

    @Override
    public void eat(String food) {
        if (food.equals("hay")) {
            System.out.println(getName() + " happily munches on " + food + ".");
            addToScore(8);
        } else {
            System.out.println(getName() + " is not interested in " + food + ".");
        }
    }

    @Override
    public void play() {
        System.out.println(getName() + " sprays water with its trunk.");
        addToScore(6);
    }
}

