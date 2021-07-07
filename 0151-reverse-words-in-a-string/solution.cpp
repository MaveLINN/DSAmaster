class Solution {
public:
    string reverseWords(string s) {
        const int n = s.size();
        vector<string> v ;
        stringstream ss(s) ;
        string word ;
        while(ss >> word){
            v.push_back(word);
        }
        
        string res="";
        for(int i = v.size() - 1 ; i >= 0 ; i--) res+= v[i] + " ";
        res.pop_back();

        return res ;
    }
};
