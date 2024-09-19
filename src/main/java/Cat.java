public class Cat extends Pet {

    private String favoriteToy; // specific to Cat

    @Override
    public void play() {
        System.out.printf("Cat (" + name + ") is playing with " + favoriteToy);
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    @Override
    public boolean equals(Object anotherCat) {
        if (this == anotherCat) {
            return true;
        }
        if (anotherCat == null || getClass() != anotherCat.getClass()) {
            return false;
        }
        Cat cat = (Cat) anotherCat;

        return super.equals(cat) &&
                this.favoriteToy.equals(cat.favoriteToy);
    }

    /*
    constructor
     */
    public Cat(String name, int age, String favoriteToy) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }

    public Cat(Cat anotherCat) {    // copy constructors
        super(anotherCat.name, anotherCat.age);
        this.favoriteToy = anotherCat.favoriteToy;
    }

    public String toString(String str) {
        return super.toString() + " favorite toy:" + favoriteToy;
    }
}
