class HeightMainBalanc03 {
    public static void main(String[] args) {
        Height03 ob = new Height03();
        // ob.push(new int[] {15,10,12,5,8,20});
        ob.push(new int[] {3,9,20,15,7});
        ob.displayNode();
        
        // Display height of the tree
        System.out.println("Height of the tree: " + ob.height());
        
        // Check if the tree is balanced and display the result
        System.out.println("Is the tree balanced? " + ob.balanced());
    }
}
