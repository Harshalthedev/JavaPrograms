import java.util.Scanner;

public class BinaryTree01 {

    public BinaryTree01() {
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
    // private String sum = "";
    public int leafsum() {
        return leafsum(root, "");
    }
    private int finalSum = 0;
    private int leafsum(Node node, String sum) {
        sum += Integer.toString(node.value);
        if ( node.left == null && node.right == null) {
            finalSum += Integer.parseInt(sum, 2);
            return finalSum;
        }
        leafsum(node.left, sum);
        leafsum(node.right, sum);
        return finalSum;
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.right, indent + "\t");
        display(node.left, indent + "\t");
    }
}
