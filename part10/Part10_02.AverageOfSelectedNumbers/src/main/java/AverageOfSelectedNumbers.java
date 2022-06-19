
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println("Input numbers, type 'end' to stop.");
        while (true) {
            String inputNum = scanner.nextLine();
            if (inputNum.equals("end")) {
                break;
            }
            nums.add(Integer.valueOf(inputNum));
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p) ");
        String input = scanner.nextLine();
        if (input.equals("n")) {
            System.out.println(nums.stream().mapToInt(v -> Integer.valueOf(v)).filter(v -> v < 0).average().getAsDouble());

        } else {
            System.out.println(nums.stream().mapToInt(v -> Integer.valueOf(v)).filter(v -> v >= 0).average().getAsDouble());
        }
    }
}
