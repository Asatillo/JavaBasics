public class Main{

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.pop());
        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack);

    }
}