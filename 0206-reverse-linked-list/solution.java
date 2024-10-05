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
        
        ListNode curr = head ;
        ListNode NEXT = head ;
        ListNode prev = null ;
        
        while(NEXT != null){
            NEXT = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = NEXT ;
        }
        return prev ;
    }
}
