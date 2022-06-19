
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nums = new ArrayList<>();
        System.out.println(String.format("Input numbers, type end to stop."));

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            nums.add(input);
        }

        double average = nums.stream()
                .mapToInt(value -> Integer.valueOf(value))
                .average()
                .getAsDouble();
        System.out.println("average of the numbers: " + average);
    }
}
