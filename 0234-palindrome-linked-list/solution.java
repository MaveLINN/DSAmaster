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

    public ListNode getMiddle(ListNode head){
        ListNode slow = head ;
        ListNode fast = head ;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next ;
        }
        return slow ;
    }

    public ListNode reverseListFromMid(ListNode head){
        ListNode next = head ;
        ListNode curr = head ;
        ListNode prev = null ;

        while(next != null){
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        return prev ;
    }

    public boolean isPalindrome(ListNode head) {
        
        ListNode temp = head ;
        ListNode midNode = getMiddle(head) ;
        ListNode midNodeAfterReverse = reverseListFromMid(midNode);

        while( midNodeAfterReverse != null){
            if(temp.val != midNodeAfterReverse.val) return false ;
            temp = temp.next ;
            midNodeAfterReverse = midNodeAfterReverse.next ;
        }

        return true ;
    }
}
