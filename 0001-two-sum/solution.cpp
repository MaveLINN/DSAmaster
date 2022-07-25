class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        int num = 0 ;
        vector<int> v;
        vector<pair<int,int>> vp ; 
        
        for(auto &i : nums){
            vp.push_back({i,num++});
        }
        
        sort(vp.begin() , vp.end());

        int l = 0 , h = nums.size() - 1;
        while(l < h){
            int sum = vp[l].first + vp[h].first ;

            if( sum == target){
                v.push_back(vp[l].second);
                v.push_back(vp[h].second);
                break ;
            }
            else{
                if(sum > target) h-- ;
                else l++ ;
            }
        
        }
        
        return v ;
    }
};
