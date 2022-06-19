
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv")).map(line -> line.split(","))
                    .sorted((a, b) -> { return Double.valueOf(a[5]) < Double.valueOf(b[5]) ? -1 : 1;})
                    .forEach(row -> System.out.println(row[3] + " (" + row[4] + "), " + row[2].replaceAll("[^a-zA-Z]", "") + ", " + row[5]));

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
