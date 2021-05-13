class Solution {
public:
    int findNumbers(vector<int>& nums) {
        
        const int n = nums.size();
        int res = 0 ;
        for(int i = 0 ; i < n ; i++){
            
            int ck = nums[i];
            int ct = 0 ;
            while(ck){
                ct++;
                ck /= 10 ;
            }
            
            if(ct % 2 == 0)res++;
            
        }
        
        return res ;
        
    }
};
