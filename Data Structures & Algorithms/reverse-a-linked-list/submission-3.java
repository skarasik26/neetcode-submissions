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
    ListNode prev = null;
    public ListNode reverseList(ListNode head) {
        // ListNode prev = null;
        // while(head != null){
        //     ListNode n = head.next;
        //     head.next = prev;
        //     prev = head;
        //     head = n;
        // }
        // return prev;
        
        if (head != null){
            ListNode n = head.next;
            head.next = prev;
            prev = head;
            head = n;
            return reverseList(head);
        }
        return prev;
    }
}
