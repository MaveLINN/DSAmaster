class Solution {
public:
    int maxDepth(string s) {
        int res= INT_MIN , ck = 0 ; 
        
        for(auto &i : s ){
            
            if(i == '(') ck++;
            res = max(res,ck);
            
            if(i == ')')ck-- ;
            
        }
        return res ;
    }
};
