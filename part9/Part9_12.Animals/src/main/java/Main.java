
public class Main {

    public static void main(String[] args) {

        // Test Part 1
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        Dog fido = new Dog("Fido");
        fido.bark();

        // Test Part 2
        Cat cat = new Cat();
        cat.purr();
        cat.eat();
        Cat garfield = new Cat("Garfield");
        garfield.purr();

        // Test Part 3
        NoiseCapable doggy = new Dog();
        doggy.makeNoise();
        NoiseCapable kitten = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat) kitten;
        c.purr();
    }
}
