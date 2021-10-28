package fast_and_slow_pointers;


class ListNode {
    int value = 0;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}
public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                return true; // found the cycle
        }
        return false;
    }

    public static void main(String[] args) {




    }
}
