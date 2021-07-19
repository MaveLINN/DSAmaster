class Solution {
public:
    int maxNumberOfBalloons(string text) {
        const int n = text.size();
        vector<int> v(26,0);
        for(auto &i : text )v[i-'a']++;

        return min(v[1],min(v[0],min(v[11]/2,min(v[14]/2,v[13])))) ;
    }
};
