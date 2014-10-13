

public abstract class Item {
    protected String name;
    protected int size;

    public Item(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public String toString() {
        return ("name: " + this.name + " size: " + this.size);
    }

}
