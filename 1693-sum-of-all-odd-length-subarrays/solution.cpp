class Solution {
public:
    int sumOddLengthSubarrays(vector<int>& arr) {
        
        const int n = arr.size();
        
        int res = 0 ;
        for(int i = 0 ; i < n ; i++){
            res += ((n-i)*(i+1)+1)/2*arr[i];
        }
        
        return res ;
        
    }
};
