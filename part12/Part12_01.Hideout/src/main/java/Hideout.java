public class Hideout <Type> {
    private Type hiddenObj;

    public Hideout() {
    }

    public void putIntoHideout(Type toHide) {
        this.hiddenObj = toHide;
    }

    public Type takeFromHideout() {
        Type holder = this.hiddenObj;
        this.hiddenObj = null;
        return holder;
    }

    public boolean isInHideout() {
        return this.hiddenObj != null;
    }
}
