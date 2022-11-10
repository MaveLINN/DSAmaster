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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(1); // a dummy node which help in pointing the sorted nodes ,
        ListNode res = temp ; // a pointer which points the initial poistion of dummy node .

        while(list1 != null && list2 != null ){ // if any of  the list is null then it should be assigned directly
            if(list1.val > list2.val){      
                temp.next = list2;
                list2 = list2.next ;
            }
            else{
                temp.next = list1;
                list1 = list1.next ;
            }
            temp = temp.next ;
        }
        temp.next = list1 == null ? list2 : list1 ; // if list is null 


        return res.next ; // as res point to the initial position of temp , and the resultant list starts from the temp next .         
                          
    }
}
