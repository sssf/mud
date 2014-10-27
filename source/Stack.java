public class Stack<T> {

    private Node top = null;
    private int count = 0;

    public Stack(T[] array) {
        for (int i = 0; i < array.length; ++i) {
            this.push(array[i]);
        } 
    } 

    public Stack() {
    } 

    public void push(T value) {
        ++count;
        this.top = new Node(value, this.top);
    } 

    public T top() {
        if (count <= 0) {
            return null;
        }
        return this.top.get();
    }

    public T pop() {
        if (count <=  0 || this.top == null) {
            return null;
        } 
        --count;
        Node top = this.top;
        this.top = this.top.getNext();
        return top.get();
    } 

    private class Node {
        private Node next;
        private T value;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        } 
       
        public T get() {
            return this.value;
        } 

        public Node getNext() {
            return this.next;
        } 
    } 
    public static void main(String[] args) {
        String[] str = {"Hej","Tommy", "vagbratt"};
        Stack<String> stack = new Stack<String>(str);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    } 
} 
