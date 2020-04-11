/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        
        ListNode *n = head , *m = head ; 
        while(m != NULL){
         m = m->next ; 
            if( m == NULL)return n ; 
         n = n->next ;
         m = m-> next ;
        }
        return n ;
    }
};
