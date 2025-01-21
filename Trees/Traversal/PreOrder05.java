import java.util.Scanner;

public class PreOrder05 {

    public PreOrder05() {
    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Insert element
    public void populate(Scanner scanner) {
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter the number in the left of " + node.value + "? (true/false)");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of this node " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter the number in the right of " + node.value + "? (true/false)");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of this node " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void preOrder() {
        preOrder(root);
    }
    private void preOrder(Node node) {
        if ( node == null) {
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PreOrder05 po = new PreOrder05();
        po.populate(scanner);
        po.preOrder();
        // po.display();
    }
}
