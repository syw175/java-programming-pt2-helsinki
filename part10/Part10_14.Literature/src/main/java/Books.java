public class Books {
    private String name;
    private int recAge;

    public Books(String name, int recAge) {
        this.name = name;
        this.recAge = recAge;
    }

    public String getName() {
        return this.name;
    }

    public int getRecAge() {
        return this.recAge;
    }

    @Override
    public String toString() {
        return String.format("%s (recommended for %d year-olds or older)", getName(), getRecAge());
    }
}

