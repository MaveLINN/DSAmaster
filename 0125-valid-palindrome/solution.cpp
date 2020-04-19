class Solution {
public:
    bool isPalindrome(string s) {
        string ret = "";
        for(auto i : s) if( ( i > 47 and i < 58) || (i > 64 and i < 91) || ( i > 96 and i < 123)){
            if( i > 64 and i < 91 )ret += (char)(i+32);
            else ret += i ;
        } 
           // cout << ret ;
            const int n = ret.size() ;
             for(int i = 0 ; i < n/2 ; i++){
                 if(ret[i] != ret[n - i - 1])return false ;
             } 
            
            return true ;
        }
};
