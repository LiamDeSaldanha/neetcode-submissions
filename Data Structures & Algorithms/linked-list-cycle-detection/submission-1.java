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
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        List<ListNode> visited = new ArrayList<>();
        while (!visited.contains(head)) {
            visited.add(head);
            if(head.next==null){
                return false;
            }
            head = head.next;
        }

        if (head == null) {
            return false;
        }
        return true;
    }
}
