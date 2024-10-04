class Solution {
public:
    int rm[1005][1005] ;
    int longestCommonSubsequence(string s, string ss) {
        memset( rm , -1 , sizeof rm);
        return go( 0 , 0 , s , ss);
    }
    
    int go( int i , int j , const string &s , const string &ss){
        
        if( i >= s.size() or j >= ss.size())return 0 ;
        if(rm[i][j] != -1)return rm[i][j] ;
        
        if(s[i] == ss[j]) rm[i][j] = 1 + go( i + 1 , j + 1 , s , ss);
        else rm[i][j] = max( go( i , j + 1 , s , ss) ,  go( i + 1 , j , s , ss));
        
        return rm[i][j];
    }
};
