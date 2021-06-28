class Solution {
public:
    vector<int> partitionLabels(string s) {
        const int n = s.size();
        int prev = -1 , maxi = 0 ; 
        vector<int> v(26),res;
        for(int i = 0 ; i < n ; i++)v[s[i]-97] = i ;
        
        for(int i = 0 ; i < n ; i++){
            maxi = max(maxi , v[s[i]-97]);
            if(i == maxi){
                res.push_back(maxi - prev);
                prev = i ;
            }
        }
        return res ;
    }
};
