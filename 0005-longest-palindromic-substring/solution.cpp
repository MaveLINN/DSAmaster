class Solution {
public:
    string longestPalindrome(string s) {
        
        
        int st = 0 , ed = 0 , res = 0 , gg = 0 ;
        
        for(int i = 0 ; i < s.size() ; i++){
        int x = palen( s , i , i);
        int xx = palen(s , i , i + 1);    
        res = max(x , xx);
            
          if(res > (ed - st)){
              gg = res ;
              st = i - (res - 1) / 2 ;
              ed = i + (res / 2) ;
          }  
        }
        
        string ans = s.substr( st , gg);
        return ans ;
    }
    
    
    
    int palen(string s , int l , int r ){
        if(s == "" or l > r)return 0 ; 
        while( l >= 0 and r < s.size() and s[l] == s[r]){
            l-- ; r++;
        }
        return r-l-1;
    }
};
