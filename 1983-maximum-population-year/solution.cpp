class Solution {
public:
    int maximumPopulation(vector<vector<int>>& logs) {
        
        const int n = logs.size();
        int a[2051] = {},res = 0 ;
        
        for(int i = 0 ; i < n ; i++){
         a[logs[i][0]]++ ; a[logs[i][1]]-- ;   
        }
        
        for(int i = 1950 ; i < 2051 ; i++){
            a[i] += a[i-1] ;
            
            res = a[i] > a[res] ? i : res ;
        }
        
        return res ;
    }
};
