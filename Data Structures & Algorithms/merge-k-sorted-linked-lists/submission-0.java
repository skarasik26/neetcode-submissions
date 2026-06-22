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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode result = lists[0];
        for(int i = 1; i < lists.length; i++){
            result = merge(result, lists[i]);
        }
        return result;
    }

    public ListNode merge (ListNode leftHead, ListNode rightHead){
        if(leftHead == null && rightHead == null) return null;
        else if (leftHead == null) return rightHead;
        else if (rightHead == null) return leftHead;
        ListNode res = null;
        if (leftHead.val <= rightHead.val) {
            res = leftHead;
            leftHead = leftHead.next;
        } else{
            res = rightHead;
            rightHead = rightHead.next;
        }
        ListNode cur = res;
        while(leftHead != null && rightHead != null){
            if(leftHead.val <= rightHead.val){
                cur.next = leftHead;
                cur = cur.next;
                leftHead = leftHead.next;
            }
            else{
                cur.next = rightHead;
                cur = cur.next;
                rightHead = rightHead.next;
            }
        }
        while(leftHead != null){
            cur.next = leftHead;
            cur = cur.next;
            leftHead = leftHead.next;
        }

        while(rightHead != null){
            cur.next = rightHead;
            cur = cur.next;
            rightHead = rightHead.next;
        }
        return res;
    }
}
