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
    public ListNode oddEvenList(ListNode head) {

        if(head == null) return head ;

        ListNode curr = head ;
        ListNode even = head.next ;
        ListNode evenhead = even ;


        while( even != null && even.next != null){
            curr.next = curr.next.next;
            even.next = even.next.next;
            curr = curr.next ;
            even = even.next ;
        }

        curr.next = evenhead ;
        return head ;
    }
}
