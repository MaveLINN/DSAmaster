class Solution {
public:
    int uniqueMorseRepresentations(vector<string>& words) {
        const int n = words.size();
        if(n == 1) return 1 ;
        string s[26] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    
    unordered_set <string> st ;
    for(auto &w : words){
        string res="";
        for(auto &i : w){
            res += s[i-'a'];
        }
        st.insert(res);
    }
    
    return st.size();
}
};
