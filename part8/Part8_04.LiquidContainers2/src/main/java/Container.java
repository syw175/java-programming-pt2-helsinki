public class Container {
    private int volume;

    public Container() {
        this.volume = 0;
    }

    public boolean validInput(int integer) {
        return integer >= 0;
    }
    public int contains() {
        return this.volume;
    }

    public void add(int liquid) {
        if (validInput(liquid)) {
            this.volume += liquid;
        }

        if(this.volume > 100) {
            this.volume = 100;
        }
    }

    public void remove(int liquid) {
        if (validInput(liquid)) {
            this.volume -= liquid;
        }

        if (this.volume < 0) {
            this.volume = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%d/100", this.volume);
    }
}
