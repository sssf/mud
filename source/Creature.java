

public abstract class Creature implements Talkable {

    protected String name;

    public Creature(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void talk() {
        // TODO: randomize responses
        System.out.println(name + " say: I don't want to talk to you");
    }

    public String toString() {
        return "name: " + this.name;
    }
}
