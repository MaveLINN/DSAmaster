class Solution {
public:
    int firstUniqChar(string s) {
        vector<int> v(26);
        for(auto i : s)v[i-97]++;
       int k = 0 ;
    for(auto i : s){ if(v[i-97] == 1) return k ; k++ ;}
        return -1 ;
    }
};
