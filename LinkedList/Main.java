class Main{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Single ll = new Single();
        // ll.addbegin(arr);     //insert at start
        ll.addend(arr);       //insert at end
        ll.display();
        // System.out.println();
        // ll.reverse();            //reverse linkedlist
        // ll.display();
        System.out.println();
        // ll.insertAt(4,3)  ;        // insert at specific index
        // ll.display();
        
        ll.deletion(3);         // delete at specific index
        ll.display();

        // Double db = new Double();
        // db.insert(arr);
        // System.out.println(db.size);
        // db.display();
        // System.out.println();
        // db.revdisplay();
    }
}