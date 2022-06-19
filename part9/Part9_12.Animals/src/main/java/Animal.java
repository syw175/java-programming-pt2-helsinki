public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println(this.getName() + " sleeps");
    }

    public void eat() {
        System.out.println(this.getName() + " eats");
    }

    public String getName() {
        return this.name;
    }
}
