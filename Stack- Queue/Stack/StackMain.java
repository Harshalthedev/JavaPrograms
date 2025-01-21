public class StackMain {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack();
        stack.push(25);
        stack.push(5);
        stack.push(55);
        stack.push(15);
        stack.push(85);
        stack.push(95);
        stack.push(105);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.peek());
    }
}