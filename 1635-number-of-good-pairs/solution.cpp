class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        const int n = nums.size();

        int hp[101]={0};
        for(int i = 0 ; i < n ; i++){
            hp[nums[i]]++;
        }
        int res = 0 ;
        for(int i = 1 ; i < 101 ; i++){
            int k = hp[i];
            res += k*(k-1)/2 ;
        }

        return res ;
    }
};
