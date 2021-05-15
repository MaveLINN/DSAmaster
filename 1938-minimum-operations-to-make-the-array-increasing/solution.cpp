class Solution {
public:
    int minOperations(vector<int>& a) {
        const int n = a.size();
        
        int res = 0  , ck = -1;
        for(int i = 1 ; i < n ; i++){
            
            if(a[i] <= a[i-1]){
                ck = a[i] ;
                a[i] = a[i-1] + 1 ; 
                res += (a[i]-ck) ;
            }
            
        }
        
        return res ; 
    }
};
