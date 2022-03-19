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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode list = new ListNode();
        list = null ;
        if(lists == null || lists.length == 0) return list ;
        if(lists.length == 1)return lists[0];
        
        list = mergeList(lists[0],lists[1]);
        for(int i = 2 ; i < lists.length ; i++){
            list = mergeList(list,lists[i]);
        }
        return list ;
    }
    
    public ListNode mergeList(ListNode l1 , ListNode l2){

        if(l1 == null) return l2 ;
        if(l2 == null) return l1 ;

        ListNode list = new ListNode(-1);
        ListNode temp = list ;
        while( l1 != null && l2 != null){
            if(l1.val < l2.val){
                list.next = l1 ;
                l1 = l1.next ;
            }
            else{
                list.next = l2 ;
                l2 = l2.next ;
            }
            list = list.next ;
        }

        list.next = l1 == null ? l2 :l1 ;
        return temp.next ;
    }
}
