class ListNode {
    int val;
    ListNode next;

    // Constructors
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    // Deserialize a string like "[2,4,3]" to a linked list
    public static ListNode deserialize(String data) {
        if (data == null || data.length() <= 2) {
            return null; // Return null if the string is empty or "[]"
        }

        // Remove the brackets and split by commas
        String[] nodes = data.substring(1, data.length() - 1).split(",");

        // Initialize the dummy head of the list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Parse each value and create the linked list nodes
        for (String node : nodes) {
            current.next = new ListNode(Integer.parseInt(node.trim()));
            current = current.next;
        }

        // Return the next node after dummy, which is the actual head of the list
        return dummy.next;
    }
}

public class add2number {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Initialize a dummy node to hold the result
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        // Traverse both linked lists
        while (l1 != null || l2 != null) {
            // Get the values of the current nodes, or 0 if one list is shorter
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Calculate the sum and update carry
            int sum = carry + x + y;
            carry = sum / 10;

            // Create the next node for the result
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move to the next nodes in the input lists
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If there is still a carry, add it as a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Return the next node after the dummy node
        return dummy.next;
    }

    public static void main(String[] args) {
        // Deserialize the input linked lists
        ListNode param_1 = ListNode.deserialize("[2,4,3]");
        ListNode param_2 = ListNode.deserialize("[5,6,4]");

        // Call the addTwoNumbers function
        ListNode result = new Solution().addTwoNumbers(param_1, param_2);

        // Output the result (for testing purposes)
        printList(result);
    }

    // Helper function to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
