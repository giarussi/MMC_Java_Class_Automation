package zooGame;

class Lion extends Animal {
    private String furColor;

    public Lion(String name, int age, String furColor) {
        super(name, "Lion", age, "Grasslands");
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }

    @Override
    public void eat(String food) {
        if (food.equals("steak")) {
            System.out.println(getName() + " settles in to eat his " + food + ".");
            addToScore(10);
        } else {
            System.out.println(getName() + " is not interested in " + food + ".");
        }
    }

    @Override
    public void play() {
        System.out.println(getName() + " playfully pounces around.");
        addToScore(5);
    }
}
