class Solution {
public:
    string convert(string s, int numRows) {
        
        if(numRows == 1) return s ;
        
        string res ="";
        vector<string> v(numRows , "");
        int r = 0 , check = 0 ; 
        
        for(int i = 0 ; i < s.size() ; i++){
            v[r] += s[i] ;
            
            if(r == 0)check = 0 ;
            else if(r == numRows - 1 ) check = 1 ;
            
            if(check == 0) r++ ;
            else if(check == 1 ) r-- ;
        }
        
        for(auto &i : v) res += i ;
        return res ;
    }
};
