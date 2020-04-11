class Solution {
public:
    bool backspaceCompare(string s, string t) {
    
        if(len(s).compare(len(t)) == 0)
            return true ; 
        else return false ;
    }
    
    string len(string s ){
        string res = "";

        for(auto i : s){
            if( i == '#'){
                if(!res.empty())res.pop_back();
            }else res += i ;
        }
        
    return res ;
  }
};
