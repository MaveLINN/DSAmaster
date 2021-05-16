class Solution {
public:
    int oddCells(int m, int n, vector<vector<int>>& indices) {
        
        const int x = indices.size();
        int a[m][n];
        memset( a , 0 , sizeof a);
        
        for(int i = 0 ; i < x ; i++){
            
            for(int j = 0 ; j < n ; j++){
                a[ indices[i][0] ][ j ] += 1;
            }
            
            for(int k = 0 ; k < m ; k++){
                a[ k ][ indices[i][1] ] += 1;
            }
            
        }
        int res = 0 ; 
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(a[i][j]%2)res++;
            }
        }
        
        
        return res ;
    }
};
