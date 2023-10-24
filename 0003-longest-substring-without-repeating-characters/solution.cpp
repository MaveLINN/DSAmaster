class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        const int n = s.size();
        vector<int> v(256,-1);
        int res = 0 , ck = -1 ;
        for(int i = 0 ; i < n ; i++ ){
                if(v[s[i]] > ck)
                    ck = v[s[i]];
                v[s[i]] = i ;
                res = max(res,i-ck);
        }
        
        return res ;
    }
};

