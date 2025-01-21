import java.util.Scanner;
public class Bt {
    public static class Node {
        int value;
        Node left;
        Node right;
        Node(int value) {
            this.value = value;
        }
    }
    public static Node root;  
    public static void rootinitialize(Scanner scanner) {
        System.out.println("emter the value of root: ");
        int value = scanner.nextInt();
        root = new Node(value);
        family(root , scanner);
    }
        
    public static void family( Node node , Scanner sc) {
        
        System.out.println("do u want enter the element to left of "+node.value+" true/false");
        boolean left = sc.nextBoolean();
        if ( left) {
            System.out.println("enter the element to the left of "+node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            family(node.left, sc);
        }
        
        System.out.println("do u want enter the element to right of "+node.value+" true/false");
        boolean right = sc.nextBoolean();
        if ( right) {
            System.out.println("enter the element to the right of "+node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            family(node.right, sc);
        }
    }
    public static void display(Node node, int level) {
        if ( node == null) {
            return;
        }
        display(node.right, level+1);                        // System.out.println(indent + node.value);
        if ( level != 0) {                                  // display(node.left, indent + "\t");
            for (int i = 0; i < level-1; i++) {            // display(node.right, indent + "\t");
                System.out.print("|\t\t");
            }                    
            System.out.println("|------->"+node.value);
        }             
        else {
            System.out.println(node.value);
        }
        display(node.left, level+1);
                     
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Bt obj = new Bt();
        rootinitialize(scanner);
        display(root, 0);
    }
}
