import java.util.Scanner;

public class Checker {
    public Checker() {
    }

    public String getPhrase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String phrase = scanner.nextLine();
        return phrase;
    }

    public boolean allVowels(String string) {
        return string.matches("[aeiuo]*");
    }

    public boolean timeOfDay(String string) {
        return string.matches("(2[0-3]|0\\d|1\\d)(:[0-5]\\d){2}");
    }

    public boolean isDayOfWeek(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
}
