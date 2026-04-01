/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        int c = 0;

        // Move fast n+1 steps ahead
        while(c <= n){
            fast = fast.next;
            c++;
        }

        // Move both pointers
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

    // Delete node
        slow.next = slow.next.next;

        return dummy.next;
        }
}
