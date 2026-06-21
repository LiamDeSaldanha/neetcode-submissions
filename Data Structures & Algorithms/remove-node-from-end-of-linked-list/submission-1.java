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
        int len =0;
        ListNode x= head;
        while(x!=null){
            len++;
            x=x.next;
        }
        if(len==1){
            return null;
        }
        x=head;
        int pos = len-n;
        int count =0;

        if(pos==0){
            x = head.next;
            return x;
        }
        while(x!=null){
            count++;
            if(count ==pos){
                x.next=x.next.next;
            }
            x=x.next;
        }
        return head;
    }
}
