class Solution {
public:
    int vis[1001][1001] ;
    const int dx[4] = { 0 ,1 , 0 , -1};
    const int dy[4] = { 1 ,0 , -1, 0 };
    
    int numIslands(vector<vector<char>>& v) {
    if( v.size() == 0)return 0 ;    
    memset( vis , 0 , sizeof vis);
    int ret = 0 ;
    
    const int n = v.size() ;  
    const int m = v[0].size() ;    

            for(int i = 0 ; i < n ; ++i){
                for(int j = 0 ; j < m ; ++j){
                    if(v[i][j] == '1' and vis[i][j] == 0){
                        dfs(i,j , n , m , v) ; ret++ ; 
                    }
                }
            }
        return ret ;
    }
    
    
    void dfs(int i , int j , int n , int m , vector<vector<char>>& v){
        
        vis[i][j] = 1 ;
        for(int k = 0 ; k < 4 ; k++){
            if(check( i + dx[k] , j + dy[k] , n , m , v ))
                dfs( i + dx[k] , j + dy[k] , n , m , v) ;
        }
    }
    
    
    
    bool check(int i , int j , int n , int m , vector<vector<char>>& v ){
        if( i >= 0 and i < n and j >= 0 and j < m and vis[i][j] == 0 and v[i][j] == '1') return true ;
        return false ;
    }
    
};
