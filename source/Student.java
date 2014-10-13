

class Student extends Creature {

    private Course complededCourse;
    private Course currentCourse;

    public Student(String name, Course complededCourse, Course currentCourse) {
        super(name);
        this.complededCourse = complededCourse;
        this.currentCourse   = currentCourse;
    }

    public void talk() {
        String message = "Hey!";
        System.out.println(this.name + " say:" + message);
    }

    // TODO: TRADE

}
