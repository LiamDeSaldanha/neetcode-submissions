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
        ListNode newHead = new ListNode();
        ListNode p = new ListNode();

        List<ListNode> list = new ArrayList<>();

        while(head!=null){

            list.add(head);
            head = head.next;
        }

        int lp =0;
            newHead = p;

        while(lp<=Math.ceil(list.size()/2f)-1){
            p= list.get(lp);
            System.out.println(p.val);
            p.next = list.get(list.size()-1-lp);
            p=p.next;
            lp++;
            if(lp>Math.ceil(list.size()/2f)-1){
                p.next=null;
            }else{
            p.next = list.get(lp);

            }
            
            

        }
        
        
            
        
        
    }
}
