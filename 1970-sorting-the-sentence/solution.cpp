class Solution {
public:
    string sortSentence(string s) {
        const int n = s.size();
        vector<pair<int,string>> v ;
        
        stringstream ss(s);
        string word ; 
        int ct = 0 ;
        while(ss >> word){
            int x = word.back();word.pop_back();
            v.push_back({x,word});
        }
        sort(v.begin(),v.end());
        string res="";
        for(auto &i : v)
            res += i.second +" ";
        res.pop_back();
        
        return res ;
    }
};
