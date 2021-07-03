class Solution {
public:
    vector<int> findClosestElements(vector<int>& arr, int k, int x) {
        const int n = arr.size();
        priority_queue<pair<int,int>> pq ; 
        
        for(int i = 0 ; i < n ; i++){
            pq.push({abs(x-arr[i]) , arr[i]});
            if(pq.size() == k + 1) pq.pop();
        }
        
        vector<int> v ;
        while(!pq.empty()){
            v.push_back(pq.top().second);
            pq.pop();
        }
        
        sort(v.begin(),v.end());
        
        return v ;
    }
};
