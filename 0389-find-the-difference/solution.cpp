class Solution {
public:
    char findTheDifference(string s, string t) {
        const int n = s.size();
        const int m = t.size();
        
        int pre[26];
        memset(pre , 0 , sizeof pre);
        
        for(auto &i : t){
            pre[i-'a']++;
        }
        for(auto &i : s){
            pre[i-'a']--;
        }

        for(int i = 0 ; i < 26 ; i++){
            if(pre[i] > 0) return char(97+i);
        }
        return ' ';
    }
};
