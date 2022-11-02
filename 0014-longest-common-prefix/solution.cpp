class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string res(strs[0]);
        for(int i = 1 ; i < strs.size() ; i++){
            res = check(res,strs[i]);
        }
        return res ;
    }

    string check(string a , string b){
        string res="";
        for(int i = 0 ; i < min(a.size(),b.size()) ; i++){
            if(a[i] != b[i])break;
            res += a[i] ;
        }
        return res ;
    }
};
