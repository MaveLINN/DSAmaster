class Solution {
public:
    int findCenter(vector<vector<int>>& edges) {
        const int n = edges.size();
        int l =  edges[0][0] ; 
        int r =  edges[0][1] ;
        int res ;
        if(l == edges[1][0] || l == edges[1][1]) res = l ;
        else res = r ;
        
        return res ;
    }
};
