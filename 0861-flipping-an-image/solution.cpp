class Solution {
public:
    vector<vector<int>> flipAndInvertImage(vector<vector<int>>& image) {
        const int n = image.size();
        const int m = image[0].size();
        
        vector<vector<int>> v(n) ;
        
        for(int i = 0 ; i < n ; i++){
            for(int j = m - 1 ; j >= 0 ; j--){
                if(!image[i][j])v[i].push_back(1);
                else v[i].push_back(0);
            }
        }
        return v ;
    }
};
