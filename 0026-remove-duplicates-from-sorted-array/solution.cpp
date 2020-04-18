class Solution {
public:
    int removeDuplicates(vector<int>& v) {
        
        const int n = v.size() ;
        int ret = 0 , k = 1  ;
        
        for(int i = 1 ; i < n ; i++){
               if(v[i-1] == v[i]) ret++; 
                else v[k++] = v[i] ;
        }
        
        return n - ret ;
    }
};
