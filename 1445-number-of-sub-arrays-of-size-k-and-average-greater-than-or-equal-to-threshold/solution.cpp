class Solution {
public:
    int numOfSubarrays(vector<int>& arr, int k, int threshold) {
        const int n = arr.size();
        int i = 0 , j = 0 , sum = 0 , res = 0 ;
        
        while(j < n){
            sum += arr[j];
            if(j-i+1 < k) j++;
            else if(j-i+1 == k){
                if(sum/k >= threshold)
                res++;
               sum -= arr[i];     
               i++ ; j++;     
            }
        }
        return res ;
    }
};
