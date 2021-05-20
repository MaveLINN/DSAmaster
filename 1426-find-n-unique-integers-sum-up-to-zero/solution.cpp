class Solution {
public:
    vector<int> sumZero(int n) {
        int res = n/2 ;
        
        vector<int> v ;
        while(res > 0){
            v.push_back(res);
            v.push_back(-res);
            res--;
        }
        
        if(n%2)v.push_back(0);
        
        return v ;
    }
};
