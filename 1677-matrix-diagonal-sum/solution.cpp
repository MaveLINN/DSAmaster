class Solution {
public:
    int diagonalSum(vector<vector<int>>& mat) {
        const int n = mat.size();
        const int m = mat[0].size();
        
        int res = 0 ;
        
        for(int i = 0 ; i < n ; i++){
            
              res += mat[i][i] + mat[i][n-i-1];
            
        }
        return res += n%2 ? -mat[n/2][n/2] : 0 ;
        
    }
};
