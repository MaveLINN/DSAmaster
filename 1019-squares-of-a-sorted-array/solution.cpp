class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        const int n = nums.size();
        
        vector<int> v;
        int i = 0 , j = n - 1 ;
        
        while(i <= j){
            if(abs(nums[i]) >= abs(nums[j])){
                v.push_back(nums[i]*nums[i]);
                i++;
            }
            else{
                v.push_back(nums[j]*nums[j]);
                j--;
            }
        }
        
        reverse(v.begin() , v.end());
        return v ;
    }
};
