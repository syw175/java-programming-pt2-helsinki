
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        int numCount = 0;
        while ((num = Integer.valueOf(scanner.nextLine())) != 0) {
            if (num < 0) {
                continue;
            }
            sum += num;
            numCount++;
        }

        if (numCount != 0) {
            System.out.println(1.0* sum / numCount);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
