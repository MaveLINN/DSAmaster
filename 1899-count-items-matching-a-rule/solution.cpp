class Solution {
public:
    int countMatches(vector<vector<string>>& items, string r, string v) {
        
        const int n = items.size();
        int res = 0 ;
        
        int check = 0 ;
        if( r == "color") check = 1 ;
        if( r == "name") check = 2 ;
        
        for(int i = 0 ; i < n ; i++){
            if(items[i][check] == v)res++;
        }
        
        return res;
    }
};
