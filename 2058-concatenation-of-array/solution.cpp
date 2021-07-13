class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        const int n = nums.size();
        vector<int>res ;
        
        for(int i = 0 ; i < 2*n ; i++){
            if(i == n)i=0;
            res.push_back(nums[i]);
            if(res.size() == 2*n)break;
        }
        return res ;
    }
};
