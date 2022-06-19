import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Books> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int numAge = Integer.valueOf(scanner.nextLine());
            bookList.add(new Books(input, numAge));
        }

        System.out.printf("%d books in total.\n\nBooks:\n", bookList.size());
        bookList.stream()
                .sorted(Comparator.comparingInt(Books::getRecAge).thenComparing(Books::getName))
                .forEach(book -> System.out.println(book));
    }
}
