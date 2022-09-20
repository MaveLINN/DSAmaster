class Solution {
public:
    string longestPalindrome(string s) {
        
        int start = 0, res = 0 , stringSize = 0 ;
        
        for(int i = 0 ; i < s.size() ; i++){
        int x = palen( s , i , i); // odd palindrome start
        int xx = palen(s , i , i + 1);    // even palindrome start
        res = max(x , xx); // finding the maximum length of palindrome string
            
          if(res > stringSize ){
              stringSize = res ;
              start = i - (res - 1) / 2 ;
          }  
            
        }
        
        string ans = s.substr( start , stringSize);
        return ans ;
    }
    
    
    
    int palen(string s , int l , int r ){
        if(s == "" or l > r)return 0 ;  
        
        while( l >= 0 and r < s.size() and s[l] == s[r]){ // condition for the palindrome in 
            l-- ; r++;                                    // in string .
        }
        
        return r-l-1; // returning the length of the palindrome string 
    }
};
