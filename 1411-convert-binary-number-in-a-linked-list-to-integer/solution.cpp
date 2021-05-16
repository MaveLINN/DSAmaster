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
    int getDecimalValue(ListNode* head) {
        
        ListNode* n = head ;
        int res = 0 ;
        while(n != NULL){
            
            // res = res*2 + n->val;
            // n=n->next ;
            
            res <<= 1 ;
            res += n->val ;
            n = n ->next ; 
            
        }
        return res ;
    }
};
