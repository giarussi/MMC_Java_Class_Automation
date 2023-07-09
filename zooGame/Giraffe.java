package zooGame;

class Giraffe extends Animal {
    private int neckLength;

    public Giraffe(String name, int age, int neckLength) {
        super(name, "Giraffe", age, "Savannah");
        this.neckLength = neckLength;
    }

    public int getNeckLength() {
        return neckLength;
    }

    @Override
    public void makeSound() {
        System.out.println("Silence...");
    }

    @Override
    public void eat(String food) {
        if (food.equals("leaves")) {
            System.out.println(getName() + " stretches out its long neck to eat " + food + ".");
            addToScore(5);
        } else {
            System.out.println(getName() + " is not interested in " + food + ".");
        }
    }

    @Override
    public void play() {
        System.out.println(getName() + " gracefully walks around.");
        addToScore(3);
    }
}
