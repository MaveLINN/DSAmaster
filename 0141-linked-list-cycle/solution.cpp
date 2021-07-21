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
    bool hasCycle(ListNode *head) {
        ListNode* n = head;
        map<ListNode* , bool> mp ;
        
        while(n != NULL){
            if(mp[n])return true ;
            mp[n] = true ;
            n = n->next ;
        }
        return false ;
    }
};
