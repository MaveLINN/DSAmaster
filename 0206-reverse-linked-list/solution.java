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

        ListNode prev = null ; // it holds the previous node add 
        ListNode next = head ; // it holds the next node add
        ListNode curr = head ; // this is current node where we need to perform actions ,

        while(next != null){
            next = curr.next ; // first hold the next node add ,
            curr.next = prev ; // then break the circuit and current next hold the previous node
            prev = curr ;      // shift the previous to current 
            curr = next ;       // shift the current node to next 
        }
        
        return prev ; // previous will hold the head once the LinkedList got reversed 
    }
}
