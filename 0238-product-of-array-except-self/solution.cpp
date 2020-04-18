class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        const int n = nums.size() ;
        
        int z = 0 , pro = 1 , idx ;  
        for(int i = 0 ; i < n ; ++i){
            if(nums[i])  pro *= nums[i] ; 
            else         pro *= 1 , z++ , idx = i ;   
        }
        
        vector<int> ret(n);
        if(z == 0){
            for(int i = 0 ; i < n ; i++)
                ret[i] = pro/nums[i] ;
        }else{
            if( z == 1) ret[idx] = pro ;
        }
        
        return ret ;
    }
        
};
