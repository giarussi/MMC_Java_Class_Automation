package zooGame;

abstract class Animal {
    private String name;
    private String species;
    private int score;
    private int age;
    private String habitat;

    public Animal(String name, String species, int age, String habitat) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitat = habitat;
        this.score = 0;
    }

    // Getters and setters for the attributes

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getScore() {
        return score;
    }

    public void addToScore(int points) {
        score += points;
    }

    public int getAge() {
        return age;
    }

    public String getHabitat() {
        return habitat;
    }

    // Abstract methods

    public abstract void makeSound();

    public abstract void eat(String food);

    public abstract void play();
}





