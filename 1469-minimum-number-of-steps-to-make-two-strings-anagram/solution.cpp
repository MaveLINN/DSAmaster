class Solution {
public:
    int minSteps(string s, string t) {
        const int n = s.size();
        const int m = t.size();
        
        vector<int> v(26,0);
        for(int i = 0 ; i < n ; i++)
            v[s[i]-'a']++;
        
        for(int i = 0 ; i < n ; i++)
        v[t[i]-'a']--;
        
        int res = 0 ; 
        for(auto &i : v)res += abs(i);
        
        return res/2 ;
        
    }
};
