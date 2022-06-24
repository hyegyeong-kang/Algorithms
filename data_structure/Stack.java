public class Stack {
    static final int MAX = 100000;
    static int[] st = new int[MAX];
    static int top = 0;
    public static void main(String args[]) {

        init();

        push(1);
        push(3);
        push(6);
        pop();
        pop();
    }

    public static void init() {
        top = 0;
    }

    public static void push(int value) {
        if (isFull()) {
            System.out.println("stack is full");
        }
        st[top] = value;
        top++;
    }

    public static void pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        }
        top--;
        System.out.println(st[top]);
    }

    public static Boolean isEmpty() {
        return (top == 0);
    }

    public static Boolean isFull() {
        return (top == MAX);
    }
}
