class Solution {
public:
    int maxChunksToSorted(vector<int>& arr) {
        const int n = arr.size();
        int res = 0 , maxi = -1 ;
        
        for(int i = 0 ; i < n ; i++){
            maxi = max(maxi , arr[i]);
            if(i == maxi) res++ ;
        }
        return res ;
    }
};
