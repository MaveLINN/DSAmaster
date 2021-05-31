class Solution {
public:
    vector<string> commonChars(vector<string>& words) {
        
        const int n = words.size();
        
        vector<int>hp (26,INT_MAX);
        vector<string>res ;

        
        for(int i = 0 ; i < n ; i++){
                vector<int>hp1 (26,0);
            for(int j = 0 ; j < words[i].size() ; j++)
                hp1[words[i][j] - 'a']++;
            
            for(int j = 0; j < 26 ; j++){
                hp[j] = min(hp[j],hp1[j]);
            }
        }
        
        for(int i = 0 ; i < 26 ; i++){
            for(int j = 0 ; j < hp[i] ; j++){
                res.push_back(string(1, i + 'a'));
            }
        }
        
        return res ;
    }
};
