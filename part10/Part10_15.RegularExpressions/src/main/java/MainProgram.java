

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker testChecker = new Checker();
        String phrase = testChecker.getPhrase();

        if (testChecker.timeOfDay(phrase)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
