class Solution {
public:
    int maxCoins(vector<int>& piles) {
        const int n = piles.size();
        
        sort(piles.begin() , piles.end()) ;
        int res = 0 , i = n-2 , gg = n/3; 

        while(gg--){
            res += piles[i];
            i-=2;
        }
        
        return res ; 
    }
};
