

public class Main {

    public static void main(String[] args) {
        Book babak     = new Book("The art of temp programming", 1);
        Book all_math  = new Book("All you need to know about math", 8, 512);

        Course coding = new Course("Babak coding techniques", 30, babak);
        Course math   = new Course("Math", 5, all_math);


        Creature[] list = new Creature[4];

        list[0] = new Student("Pelle", math, coding);
        list[1] = new Student("Mama", coding, math);
        list[2] = new Teacher("Bob", math);
        list[3] = new Teacher("Babak", coding);

        for(Creature c : list) {
            c.talk();
            System.out.println(c);
        }

    }
}
