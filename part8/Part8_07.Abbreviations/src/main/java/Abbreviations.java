import java.util.HashMap;
public class Abbreviations {
    private HashMap<String, String> definitions;

    public Abbreviations() {
        this.definitions = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String definition) {
        if (this.definitions.containsKey(abbreviation)) {
            System.out.println("Abbreviation already exists!");
        } else {
            this.definitions.put(abbreviation, definition);
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.definitions.containsKey(abbreviation);
    }
    public String findExplanationFor(String abbreviation) {
        if(!hasAbbreviation(abbreviation)) {
            return null;
        }
        return this.definitions.get(abbreviation);
    }
}
