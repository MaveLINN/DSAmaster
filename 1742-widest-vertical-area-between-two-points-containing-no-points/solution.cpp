class Solution {
public:
    int maxWidthOfVerticalArea(vector<vector<int>>& points) {
        const int n = points.size();
        map<int,int> mp; 
        for(int i = 0 ; i < n ; i++){
            mp[points[i][0]]++;
        }
        
        long res = 0 , gg=mp.begin()->first; 
        for(auto it = mp.begin() ; it != mp.end() ; ++it){
            res = max(it->first - gg , res ) ;
            gg = it->first ;
        }
        return res ;
    }
};
