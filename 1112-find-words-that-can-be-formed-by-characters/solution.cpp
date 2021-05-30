class Solution {
public:
    int countCharacters(vector<string>& words, string chars) {
        const int n = words.size();
        int res = 0 ;
        vector<int>hp(26,0);
        for(auto i : chars)
            hp[i-'a']++;
        
        for(int i = 0 ; i < n ; i++){
         vector<int> v = hp ;   
            string s = words[i] ;
            int f = 1 ;
                for(int i = 0 ; i < s.size() ; i++){
                    if(v[s[i] - 'a'] > 0)v[s[i] - 'a']-- ;
                    else{
                        f = 0 ;
                        break;
                    }
                }
            if(f)res+=s.size();
        }
        
        return res ;
    }
};
