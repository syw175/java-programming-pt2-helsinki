public class Dog extends Animal implements NoiseCapable {

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    @Override
    public void makeNoise() {
        bark();
    }
    public void bark() {
        System.out.println(this.getName() + " barks");
    }
}
