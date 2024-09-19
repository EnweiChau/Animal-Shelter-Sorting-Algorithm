import java.util.Objects;

public abstract class Pet implements Animal {

    protected String name;

    protected int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pet pet = (Pet) o;
        return age == pet.age && Objects.equals(name, pet.name);
    }

    @Override
    public String toString() {
        return "age: " + age;
    }

    public abstract void play();
}
