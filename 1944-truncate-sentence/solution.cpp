class Solution {
public:
    string truncateSentence(string s, int k) {
        stringstream ss(s) ;
        string word , res="" ;
        
        while(ss >> word){
            if(k--)res+=word + " " ;
            else break;
        }
        res.pop_back();
        return res ;
    }
};
