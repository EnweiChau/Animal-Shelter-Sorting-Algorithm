import java.util.ArrayList;
import java.util.List;

public class PetShelter {
    private final List<Animal> animals = new ArrayList<>(); // The final keyword means that the variable is not changeable
    //if it was removed then animals would be modifiable

    public PetShelter(List<Animal> animals) {

        for(Animal oldAnimal : animals) {
            Animal newAnimal = null;
            if (oldAnimal.getClass() == Cat.class) {
                Cat cat = (Cat) oldAnimal;
                newAnimal = new Cat(cat.getName(),
                        cat.getAge(), cat.getFavoriteToy());
            }
            if (oldAnimal.getClass() == Dog.class) {
                Dog dog = (Dog) oldAnimal;
                newAnimal = new Dog(dog.getName(),
                        dog.getAge(), dog.getOwner());
            }
            if (oldAnimal.getClass() == WildHorse.class) {
                WildHorse wildHorse = (WildHorse) oldAnimal;
                newAnimal = new WildHorse(wildHorse.getColor());
            }
            this.animals.add(newAnimal);
        }
        /*
        TODO: add your code to make a DEEP COPY of the given array into the list
         DEEP COPY means each animal object is replicated, instead of just their references being copied
         */
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public Cat adoptCat(String name, int age, String favoriteToy) {
        Cat adoptIsCat = null;
        for (Animal adoptCat : animals) {
            if (adoptCat.getClass() == Cat.class) {
                adoptIsCat = (Cat) adoptCat;
                if (adoptIsCat.getName().equals(name) && adoptIsCat.getAge()
                        == age && adoptIsCat.getFavoriteToy().equals(favoriteToy)) {
                    animals.remove(adoptIsCat);
                }
            }
        }
        /*
        TODO:
         - Find the cat by name, age and favorite toy
         - Remove it from the list
         - Return the found cat
         */

        return adoptIsCat; // TODO: this is a placeholder. Replace this with your actual code if needed.
    }
}

