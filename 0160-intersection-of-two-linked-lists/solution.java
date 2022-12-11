/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        Map<ListNode,Boolean> mp = new HashMap<>();

        ListNode temp = headA , res = null;
        while(temp != null){          // storing first list node address 
            mp.put(temp,true);
            temp = temp.next ;
        }
        temp = headB ;
        while(temp != null){            // traversing the second list and checking if the node address already there in map or not . if presents , it means cycle exist . else not exist .
            if(mp.containsKey(temp)){
                res = temp ;
                break;
            }
            temp = temp.next ;
        }

        return res ;

    }
}
