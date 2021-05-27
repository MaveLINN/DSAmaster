class Solution {
public:
    int minCostToMoveChips(vector<int>& position) {
        const int n = position.size();
        int res = 0 ;

        for(int i = 0 ; i < n ; i++){
            if(position[i]%2)res++;
        }
        
        return min(res,n-res) ;
    }
};
