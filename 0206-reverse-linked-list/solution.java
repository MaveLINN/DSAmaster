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
        
        if(head == null) return head ;
        ListNode curr = head ;
        ListNode prev = null,temp = head;
        
        return recursive(curr,prev);
        
        
    }
    
    public ListNode recursive(ListNode curr , ListNode prev){
        if(curr == null) return prev ;
        ListNode n = curr.next ;
        curr.next = prev ;
        return recursive(n,curr);
    }
}
