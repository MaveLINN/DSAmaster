class Solution {
public:
    vector<vector<int>> diagonalSort(vector<vector<int>>& mat) {
        const int n = mat.size();
        const int m = mat[0].size();
        
        for(int i = 0 ; i < n ; i++){
            sortedMatrix(mat,i,0,n,m);
        }
        
        
        for(int i = 1 ; i < m ; i++){
            sortedMatrix(mat,0,i,n,m);
        }
        
        return mat ;
    }
    
    void sortedMatrix(vector<vector<int>>& mat , int row , int col , int n , int m){
        vector<int> v(101,0) ;
        int r = row , c = col ;
        while(r < n && c < m){
            v[mat[r][c]]++;
            r++; c++;
        }
        
        r = row ; c = col ;
        
        for(int i = 0 ; i < 101 ; i++){
            if(v[i]){
                int ct = v[i] ;
                while(ct--){
                    mat[r++][c++] = i ;
                }
            }
        }
        
    }
};
