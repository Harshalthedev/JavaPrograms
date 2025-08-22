public class Main01 {
    public static void main(String[] args) {
        // Create lists from arrays
        ListNode l1 = ListNode.fromArray(new int[]{7, 2, 4, 3}); // represents 7243
        ListNode l2 = ListNode.fromArray(new int[]{5, 6, 4});    // represents 564

        System.out.print("Input L1: ");
        l1.printList();
        System.out.print("Input L2: ");
        l2.printList();

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        result.printList();
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    // Default constructor
    public ListNode() {}

    // Constructor with value only
    public ListNode(int val) { 
        this.val = val; 
    }

    // Constructor with value and next node
    public ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }

    // Helper method: build linked list from array
    public static ListNode fromArray(int[] nums) {
        if (nums == null || nums.length == 0) return null;

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int n : nums) {
            current.next = new ListNode(n);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method: print linked list
    public void printList() {
        ListNode current = this;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = reverse(l1);
        ListNode temp2 = reverse(l2);

        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry = 0;

        while (temp1 != null || temp2 != null) {
            if (temp1 != null && temp2 != null) {
                int add = carry + temp1.val + temp2.val;
                ListNode newNode = new ListNode();
                newNode.val = add % 10;
                carry = add / 10;
                temp.next = newNode;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else if (temp1 != null) {
                int add = carry + temp1.val;
                ListNode newNode = new ListNode();
                newNode.val = add % 10;
                carry = add / 10;
                temp.next = newNode;
                temp1 = temp1.next;
            }
            else if (temp2 != null) {
                int add = carry + temp2.val;
                ListNode newNode = new ListNode();
                newNode.val = add % 10;
                carry = add / 10;
                temp.next = newNode;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if (carry > 0) {
            ListNode newNode = new ListNode();
            newNode.val = carry;
            temp.next = newNode;
        }
        return reverse(dummy.next);
    }

    public ListNode reverse(ListNode head) {
        ListNode curNode = head;
        ListNode prevNode = null;
        ListNode temp = null;

        while (curNode != null) {
            temp = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = temp;
        }
        return prevNode;
    }
}
