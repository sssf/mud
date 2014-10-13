

public abstract class Creature implements Talk {

    protected String name;

    public Creature(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void talk() {
        // TODO: randomize responses
        System.out.println(name + " don't want to talk to you");
    }
}
