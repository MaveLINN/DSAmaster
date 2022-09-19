class Solution {
public:
    int countSubstrings(string s) {
          const int n = s.size() ;
        
        bool dp[n][n] ;
        int result = 0 ;
        for(int g = 0 ; g < n ; g++){
            
            int i = 0 ;
            for(int j = g ; j < n ; i++,j++){
                
            if( g == 0){
                dp[i][j] = true;
            }else if(g == 1){
                if(s[i] == s[j]){
                    dp[i][j] = true ;
                }
                else dp[i][j] = false ;
            }else{   
                if(s[i] == s[j] and dp[i+1][j-1])
                    dp[i][j] = true ;
                else dp[i][j] = false ;   
            }  
            
                if(dp[i][j]) result++;
                
            }
            
            
        }
        return result ;
    }
};
