class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        const int m = matrix[0].size();
        const int n = matrix.size();
        
        vector<pair<int,int>> vp ;
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(!matrix[i][j])
                    vp.push_back({i,j});
            }
        }
        
        for(auto &k : vp){
            //cout << k.first << " " << k.second ;
            for(int i = 0 ; i < m ; i++ )
                matrix[k.first][i] = 0 ;
            
            for(int i = 0 ; i < n ; i++ )
                matrix[i][k.second] = 0 ;
        }
            
    }
};
