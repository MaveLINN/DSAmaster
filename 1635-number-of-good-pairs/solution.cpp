class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        const int n = nums.size();
        sort(nums.begin() , nums.end());
        
        int ct = 1 , res = 0 ;
        for(int i = 0 ; i < n - 1 ; i++){
            if(nums[i] == nums[i+1]) ct++ ;
            else{ res += ct*(ct - 1)/2 ; ct = 1 ; }
        }
        
        res += ct*(ct - 1)/2;
        return res ;
    }
};
