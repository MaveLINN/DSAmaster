class Solution {
public:
    int minPartitions(string s) {
        const int n = s.size();
        int res = INT_MIN ;
        for(auto &i : s){
            res = max(res , i - 48);
        }
        return res ;
    }
};
