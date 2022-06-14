

public class Main {

    public static void main(String[] args) {
        System.out.println("Testing BoxWithMaxWeight class");
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));
        System.out.println("\n");


        System.out.println("Testing OneItemBox class");
        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
        System.out.println("\n");

        System.out.println("Testing MisPlacingBox");
        MisplacingBox misplacedBox = new MisplacingBox();
        misplacedBox.add(new Item("Saludo", 5));
        misplacedBox.add(new Item("Pirkka", 5));

        System.out.println(misplacedBox.isInBox(new Item("Saludo")));
        System.out.println(misplacedBox.isInBox(new Item("Pirkka")));


    }
}
