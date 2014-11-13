

public class Main {


/*   When are classes loaded
 *   [Loaded Main from file:/home/tova/ioopm/mud/bin/]
 *   [Loaded java.lang.Void from /usr/lib/jvm/java-7-openjdk-amd64/jre/lib/rt.jar]
 *   [Loaded Item from file:/home/tova/ioopm/mud/bin/]
 *   [Loaded Book from file:/home/tova/ioopm/mud/bin/]
 *   [Loaded Course from file:/home/tova/ioopm/mud/bin/]
 *   [Loaded Talkable from file:/home/tova/ioopm/mud/bin/]
 *   [Loaded Creature from file:/home/tova/ioopm/mud/bin/]
 *   [Loaded Student from file:/home/tova/ioopm/mud/bin/]
 *   [Loaded Teacher from file:/home/tova/ioopm/mud/bin/]
 */

    public static void main(String[] args) {
        
        BookFactory bookFactory = new BookFactory();


        Book tempBook = bookFactory.getBook("Babak: The art of temp-programming");
        Book mathBook = bookFactory.getBook("Algebra: The complete course");

        Course coding = new Course("Babak coding techniques", 30, tempBook);
        Course math   = new Course("Math", 5, mathBook);


        Teacher babak = new Teacher("Babak", coding);

        Creature[] list = new Creature[4];

        list[0] = new Student("Pelle", math, coding);
        list[1] = new Student("Mama", coding, math);
        list[2] = new Teacher("Bob", math);
        list[3] = babak;

        for(Creature c : list) {
            c.talk();
            System.out.println(c);
        }

        babak.teach();
    }
}
