class Solution {
public:
    int maxIncreaseKeepingSkyline(vector<vector<int>>& grid) {
        const int n = grid.size();
        const int m = grid[0].size();
        
        int res = 0 , gg = -1 ; 
        vector<int> row(n) , column(n) ; 
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                row[i] = max(row[i],grid[i][j]);
                column[i]=max(column[i],grid[j][i]);
            }
        }
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                res += min(row[i],column[j]) - grid[i][j] ;
            }
        }
        
        return res ;
    }
};
