
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));
    }

    public static int sum (int[] numArr, int fromWhere, int toWhere, int smallest, int largest) {
        int sum = 0;

        if (fromWhere < 0) {
            fromWhere = 0;
        }

        if (toWhere > numArr.length) {
            toWhere = numArr.length;
        }

        for (int i = fromWhere; i < toWhere; i++) {
            if (numArr[i] >= smallest && numArr[i] <= largest) {
                sum += numArr[i];
            }
        }
        return sum;
    }
}
