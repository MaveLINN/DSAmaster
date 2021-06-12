class Solution {
public:
    vector<int> minOperations(string boxes) {
        
        const int n = boxes.size();
        vector<int> ret(n) ; 
        
        int lc = 0 , ct = boxes[0] - '0';
        for(int i = 1 ; i < n ; i++){
            ret[i] = lc + ct ;
            lc=ret[i];
            ct += boxes[i] - '0';
        }
        
        lc = 0 , ct = boxes[n-1] - '0';
        for(int i = n-2 ; i >= 0 ; i--){
            ret[i] += lc + ct ;
            lc += ct ;
            ct += boxes[i] - '0';
        }
        
        return ret ; 
        
    }
};
