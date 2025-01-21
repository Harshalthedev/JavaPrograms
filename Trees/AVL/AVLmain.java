public class AVLmain {
    public static void main(String[] args) {
        AVLtree ob = new AVLtree();
        ob.push(new int[] {10,20,30});
        // ob.push(new int[] {10, 5, 15, 3, 7, 13, 18});
        
        // Display height of the tree
        System.out.println("Height of the tree: " + ob.height());
        // Check if the tree is balanced and display the result
        System.out.println("Is the tree balanced? " + ob.balanced());
        ob.displayNode();
    }
}
