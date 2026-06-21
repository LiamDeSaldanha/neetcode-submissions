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
    public ListNode reverseList(ListNode head) {
        ListNode prev= null;
        ListNode curr;
        curr = head;
        ListNode newHead = curr;
        while(curr!=null){
            newHead =  curr;

            curr = curr.next;

            newHead.next = prev;
            prev = newHead;


        }
        return newHead;
    }
}
