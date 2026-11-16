import java.util.Scanner;

class Bt02 {
    public static void main(String[] args) {
        start();
    }
    // public static void display
    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        public TreeNode(){};
        public TreeNode(TreeNode left, TreeNode right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }
    }
    public static void start() {
        TreeNode node = new TreeNode();
        System.out.println("Enter the root node value");
        Scanner sc = new Scanner(System.in);
        node.val = sc.nextInt();
        insert(node);
        // display();
    }
    public static void insert(TreeNode node) {
        TreeNode newnode = new TreeNode();
        Scanner sc = new Scanner(System.in);
        System.out.println("Do u want to insert in left of "+node.val+ " yes/no");
        String ans = sc.nextLine(); 
        if (ans.equals("yes")) {
            System.out.println("enter the val for left node "+node.val);
            newnode.val = sc.nextInt();
            node.left = newnode;
            insert(newnode);
        }
        else {
            System.out.println("Do u want to insert in right of "+node.val+ " yes/no");
            String right = sc.nextLine();
            if (right.equals("yes")){
                System.out.println("enter the val for right node "+node.val);
                newnode.val = sc.nextInt();
                node.right = newnode;
                insert(newnode);
            }
        }
    }

}