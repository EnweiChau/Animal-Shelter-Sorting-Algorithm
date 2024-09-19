import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/*
    DO NOT CHANGE OR REMOVE GIVEN CODE except placeholders.
 */
public class MyTest {
    @Test
    public void deepCopy() {
       /*
       TODO: write a test verify the pet shelter does a DEEP COPY of the array given in the constructor:
        */
        List<Animal> animals1 = List.of(
                new WildHorse(Color.BLACK),
                new Cat("cat 3", 9, "toy 15"),
                new Cat("cat 1", 4, "toy 1"),
                new Cat("cat 2", 3, "toy 2"),
                new Dog("dog 1", 2, "owner 1"),
                new WildHorse(Color.WHITE),
                new Cat("cat 3", 9, "toy 4"),
                new Cat("cat 4", 5, "toy 5"),
                new Dog("dog 2", 1, "owner 2"),
                new WildHorse(Color.WHITE),
                new Cat("cat 5", 6, "toy 6"),
                new Dog("dog 3", 8, "owner 3"),
                new Cat("cat 3", 10, "toy 4"));
        PetShelter peta = new PetShelter(animals1);
        List<Animal> petaList = peta.getAnimals();
        for(int i = 0; i < animals1.size(); i++) {
            Animal animal = animals1.get(i);
            Animal petaAnimal = petaList.get(i);
            assertTrue(animal != petaAnimal && animal.equals(petaAnimal));
            }
        }
        // TODO: this is a placeholder. Replace this with your actual code.


    /*
    DO NOT CHANGE
     */
    @Test
    public void adoptCat() throws Exception {
        List<Animal> pets = List.of(
                new WildHorse(Color.BLACK),
                new Cat("cat 3", 9, "toy 15"),
                new Cat("cat 1", 4, "toy 1"),
                new Cat("cat 2", 3, "toy 2"),
                new Dog("dog 1", 2, "owner 1"),
                new WildHorse(Color.WHITE),
                new Cat("cat 3", 9, "toy 4"),
                new Cat("cat 4", 5, "toy 5"),
                new Dog("dog 2", 1, "owner 2"),
                new WildHorse(Color.WHITE),
                new Cat("cat 5", 6, "toy 6"),
                new Dog("dog 3", 8, "owner 3"),
                new Cat("cat 3", 10, "toy 4"));
        PetShelter shelter = new PetShelter(pets);

        final List<Animal> petsAfterAdoptingCat3 = List.of(
                new WildHorse(Color.WHITE),
                new Cat("cat 3", 9, "toy 15"),
                new Cat("cat 1", 4, "toy 1"),
                new Dog("dog 2", 1, "owner 2"),
                new Dog("dog 1", 2, "owner 1"),
                new Cat("cat 4", 5, "toy 5"),
                new WildHorse(Color.WHITE),
                new Cat("cat 3", 10, "toy 4"),
                new Cat("cat 5", 6, "toy 6"),
                new Dog("dog 3", 8, "owner 3"),
                new Cat("cat 2", 3, "toy 2"),
                new WildHorse(Color.BLACK));

        // adopt a cat that exists in the shelter
        Cat expect = (Cat) pets.get(6);
        Cat actual = shelter.adoptCat("cat 3", 9, "toy 4");

        // verify the correct cat is adopted
        assertEquals(expect, actual);

        // verify the adopted cat has been removed from system
        assertTrue(isEqualRegardlessOrOrder(shelter.getAnimals(), petsAfterAdoptingCat3));

        // adopt a cat that does not exist in the shelter
        actual = shelter.adoptCat("cat 3", 9, "toy 4");  // same cat, already removed from the shelter system
        assertNull(actual);
        assertTrue(isEqualRegardlessOrOrder(shelter.getAnimals(), petsAfterAdoptingCat3));
    }

    boolean isEqualRegardlessOrOrder(List<Animal> animalSet1, List<Animal> animalSet2) {
       /*
       TODO: this returns true if animal set 1 and set 2 contain the same set of animals, regardless of order
        */

        return false; // TODO: this is a placeholder. Replace this with your actual code.
    }
}
