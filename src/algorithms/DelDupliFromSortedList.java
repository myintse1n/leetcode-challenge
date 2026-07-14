package algorithms;

/*
*Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
*Return the lined list sorted as well.
*/
public class DelDupliFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current!=null && current.next != null) {
            if (head.val == current.next.val) {
                head.next = current.next.next;
            }else{
                head = current.next;
            }
        }

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
