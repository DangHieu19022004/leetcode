class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    
    ListNode(int val) {
        this.val = val;
    }
    
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoSortedLists {
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listmerge = new ListNode();
        ListNode current = listmerge;
        
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        
        while (list1 != null) {
            current.next = list1;
            list1 = list1.next;
            current = current.next;
        }
        
        while (list2 != null) {
            current.next = list2;
            list2 = list2.next;
            current = current.next;
        }
        
        return listmerge.next;
    }
    
    public static void main(String[] args) {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        
        ListNode list1 = null;
        
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        
        printList(solution.mergeTwoLists(list1, list2));
    }
    
    private static void printList(ListNode head) {
        System.out.print("[");
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(",");
            }
            current = current.next;
        }
        System.out.print("]");
    }
}
