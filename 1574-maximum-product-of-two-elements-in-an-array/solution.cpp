class Solution {
public:
    int maxProduct(vector<int>& nums) {
        
        const int n = nums.size();
        int f = 0, s = 0 ;
        
        for(int i = 0 ; i < n ; i++){
            
            if( nums[i] >= f ){
                s = f ; 
                f = nums[i];
            }
            else{
                if(nums[i] > s and nums[i] != f )
                    s = nums[i] ;
            }
            
        }
        
        return (s-1)*(f-1);
        
        
    }
};
