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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

    ListNode curr = head;

    while(curr != null && curr.next != null) {

        // 1️⃣ Find last node and second last node
        ListNode last = curr;
        ListNode prev = null;

        while(last.next != null){
            prev = last;
            last = last.next;
        }

        // If curr and last are same or adjacent, stop
        if(curr == last || curr.next == last)
            break;

        // 2️⃣ Insert last after curr
        prev.next = null;          // remove last
        last.next = curr.next;     // connect last to next
        curr.next = last;          // connect curr to last

        // 3️⃣ Move curr forward
        curr = last.next;
    }
    }
}
    
