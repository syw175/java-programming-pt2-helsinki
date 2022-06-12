
import java.util.HashMap;

public class Program {
    public static void printValues(HashMap<String, Book> books) {
        for (String bookTitle : books.keySet()) {
            System.out.println(books.get(bookTitle));
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> books, String partOfBook) {
        partOfBook = partOfBook.toLowerCase().trim();
        for (Book book: books.values()) {
            if (book.getName().toLowerCase().trim().contains(partOfBook)) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }
}
