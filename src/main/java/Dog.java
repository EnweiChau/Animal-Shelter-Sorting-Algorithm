public class Dog extends Pet {
    private String owner;

    public Dog(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void play() {
        System.out.printf("Dog (" + name + ") is chasing a cat.");
    }
    public boolean equals(Object anotherDog) {
        if (this == anotherDog) {
            return true;
        }
        if (anotherDog == null || getClass() != anotherDog.getClass()) {
            return false;
        }
        Dog dog = (Dog) anotherDog;

        return super.equals(dog) &&
                this.owner.equals(dog.owner);
    }
}
