/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        Map<ListNode,Boolean> mp = new HashMap<>(); // map for storing the address of node
        ListNode temp = head ;

        while(temp != null){
            if(mp.containsKey(temp)){       // if node address present , it means we already reached there , hence cycle exist.
                return true ;
            }else mp.put(temp,true);       // not present then , put it into map .
            temp = temp.next ;
        }
        return false ;
    }
}
