class NumArray {
public:
    int dp[10007];
    NumArray(vector<int>& nums) {
        const int n = nums.size();
        
        memset(dp , 0 , sizeof dp);
        int sum = 0 ;
        for(int i = 0 ; i < n ; i++){
            sum += nums[i] ;
            
            dp[i+1] = sum ; 
           // cout << sum << " " << dp[i+1] << " g ";
        }
        
    }
    
    int sumRange(int left, int right) {
        return dp[right+1] - dp[left];
    }
};

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray* obj = new NumArray(nums);
 * int param_1 = obj->sumRange(left,right);
 */
