class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        const int n = arr.size();
  //      priority_queue<int> pq ;
        vector<int> v ;
        
        v.push_back(-1);
//         pq.push(arr[n-1]);
//         for(int i = n - 2 ; i >= 0 ; i--){
//             v.push_back(pq.top());
//             pq.push(arr[i]);
//         }
        
//         reverse(v.begin() , v.end());
        
        int k = -1;
        for(int i = n - 2 ; i >= 0 ; i--){
            k = max( arr[i+1] , k ) ;
            v.push_back(k);
        }
        
         reverse(v.begin() , v.end());
        return v ;
    }
};
