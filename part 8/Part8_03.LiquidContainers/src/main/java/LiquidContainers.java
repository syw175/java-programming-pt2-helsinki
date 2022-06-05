
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstVol = 0;
        int secondVol = 0;


        while (true) {
            System.out.println(String.format("First: %d/100\nSecond: %d/100", firstVol, secondVol));
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);

            if (value < 0) {
                continue;
            }

            if (command.equals("add")) {
                firstVol+=value;
                if (firstVol > 100) {
                    firstVol = 100;
                }
            } else if (command.equals("move")) {
                if (firstVol-value < 0) {
                    value = firstVol;
                }
                firstVol-=value;
                secondVol+=value;

                if (secondVol>100) {
                    secondVol = 100;
                }

            } else if (command.equals("remove")) {
                secondVol-=value;
                if(secondVol<0) {
                    secondVol = 0;
                }
            }
        }
    }
}
