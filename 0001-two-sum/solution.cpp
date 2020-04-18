class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
    const int n = nums.size();
    vector < int > ret(2);
        
        int k = 0 ;
        vector<pair<int,int>>vp ;   
        for(auto i : nums)vp.push_back({i , k++});
        
        sort(vp.begin() , vp.end()) ;
        int l = 0 , h = n - 1 , m ; 
        while( l < h ){
            m = vp[l].first + vp[h].first ;
            if( m == target){
                ret[0] = vp[l].second ; 
                ret[1] = vp[h].second ;
                break ;
            }
           if( m > target) h-- ;
           else l++ ;
        }
            
        return ret ;

    }
};
