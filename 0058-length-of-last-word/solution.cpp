class Solution {
public:
    int lengthOfLastWord(string s) {
        const int n = s.size();
        int res=0;
        for(int i = n-1; i >= 0 ; i--){
            if(s[i] != ' ')res++;
            else if(res && s[i] == ' ') break;
        }
        return res ;
    }
};
