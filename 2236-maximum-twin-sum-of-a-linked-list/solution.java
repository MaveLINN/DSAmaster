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
    public int pairSum(ListNode head) {

        ListNode temp = head ;
        ListNode slow = head ;
        ListNode fast = head ;

        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }


        ListNode rev = reverse(slow);

        //System.out.print(slow.val);
        int res = 0 ;
        while( rev != null){
            res = Math.max(temp.val + rev.val , res );
            temp = temp.next ;
            rev = rev.next ;
        }

        return res ;
        
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head ;
        ListNode prev = null ;
        ListNode nexxt = head ;

        while( curr != null){
            nexxt = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = nexxt ;
        }
        //System.out.print(prev.val);
        return prev;
    }
}
