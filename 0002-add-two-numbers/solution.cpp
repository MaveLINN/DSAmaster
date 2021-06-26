/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
   
        ListNode* temp = new ListNode();
        ListNode* res = temp ;
        int ct = 0 , data ;
        while(l1 || l2 || ct){
            data = (l1 ? l1->val : 0) + (l2 ? l2->val : 0) + ct ;
            ct = data/10 ;
            temp->next = new ListNode(data%10);
            temp = temp->next ;
            
            l1 = l1 ? l1->next : l1 ;
            l2 = l2 ? l2->next : l2 ;
        }
        return res->next ;
    }
};
