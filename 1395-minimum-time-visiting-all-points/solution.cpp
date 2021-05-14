class Solution {
public:
    int minTimeToVisitAllPoints(vector<vector<int>>& points) {
        const int n = points.size();
        
        int res = 0 ;
        if(n < 2 )return 0 ;
        
        for(int i = 1 ; i < n ; i++){
                res +=  max( abs(points[i][0] - points[i-1][0]),abs(points[i][1] - points[i-1][1]));
        }
        
        return res ;
        
    }
};
