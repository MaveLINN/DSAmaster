class Solution {
public:
    bool checkIfPangram(string sentence) {
        const int n = sentence.size();
        
        int hp[26]={};
        for(int i = 0 ; i < n ;i++){
            hp[sentence[i] - 'a']++;
        }
        
        for(int i = 0 ; i < 26 ; i++){
            if(hp[i] == 0) return false;
        }
        return true ;
    }
};
