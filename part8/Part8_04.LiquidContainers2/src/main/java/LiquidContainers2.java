
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();


        while (true) {
            System.out.println(String.format("First: %s\nSecond: %s", container1, container2));
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                container1.add(value);
            } else if (command.equals("move")) {
                if ((container1.contains() - value) < 0) {
                    value = container1.contains();
                }
                container1.remove(value);
                container2.add(value);
            } else if (command.equals("remove")) {
                container2.remove(value);
            }
        }
    }

}
