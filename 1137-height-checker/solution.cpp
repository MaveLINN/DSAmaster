class Solution {
public:
    int heightChecker(vector<int>& heights) {
        const int n = heights.size();
        
         int res =0;
        // vector<int> v = heights ;
        // sort(v.begin() , v.end());
        // for(int i = 0 ; i < n ; i++){
        //     if(v[i]!=heights[i])res++;
        // }
        // return res ;
        
        map<int,int> mp ;       
        for(auto i : heights)mp[i]++;
        
        int k = 1 ;
        for(int i = 0 ; i < n ; i++){
            
            while( mp[k] == 0)k++;
            
            if(heights[i] != k)
                res++;
                
            --mp[k] ;    
        }
        return res ;
    }
};
