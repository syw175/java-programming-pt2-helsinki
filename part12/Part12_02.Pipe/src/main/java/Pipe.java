import java.util.ArrayList;

public class Pipe <Type> {
    private ArrayList<Type> pipeContents;

    public Pipe() {
        this.pipeContents = new ArrayList<>();
    }

    public void putIntoPipe(Type value) {
        this.pipeContents.add(value);
    }

    public Type takeFromPipe() {
        if (!this.isInPipe()) {
            return null;
        }
        Type firstVal = this.pipeContents.get(0);
        this.pipeContents.remove(0);
        return firstVal;
    }

    public boolean isInPipe() {
        return !this.pipeContents.isEmpty();
    }
}
