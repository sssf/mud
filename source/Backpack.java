import java.util.*;

public class Backpack {
    private List<Item> items;
    private int capacity;
    private int used;

    public Backpack(int capacity) {
        this.capacity = capacity;
        items = new LinkedList<Item>();
    }



    public boolean add(Item item) {
        if (this.used + item.getSize() <= capacity) {
            this.used += item.getSize();
            items.add(item);
            return true;
        }
        return false;
    }






}

