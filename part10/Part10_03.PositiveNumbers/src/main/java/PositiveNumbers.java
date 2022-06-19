import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> positiveNums = numbers.stream()
                .filter(num -> num >= 0)
                .collect(Collectors.toList());
        return positiveNums;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
}
