class Solution {
public:
    string replaceDigits(string s) {
        const int n = s.size();
        
        for(int i = 1 ; i < n ; i+=2){
            s[i] = char(s[i-1] + s[i] - 48);
        }
        return s ;
    }
};
