class Solution {
public:
    string restoreString(string s, vector<int>& indices) {
        const int n = indices.size();
        
        string res="";
        char c[n];
        for(int i = 0 ; i < n ; i++){
            c[indices[i]]= s[i];
        }
        
        for(int i = 0 ; i < n ; i++)res += c[i] ;
        return res ;
    }
};
