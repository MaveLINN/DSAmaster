class Solution {
public:
    vector<int> finalPrices(vector<int>& prices) {
        
        const int n = prices.size();
        stack<int> s ;
        vector<int> v ;
        
        for(int i = n - 1 ; i >= 0 ; i--){
            
            if(s.size()== 0)
                v.push_back(-1);
            else{
                
                if(s.size() > 0 and s.top() <= prices[i])
                    v.push_back(s.top());
                else{
                    
                    while(s.size() > 0 and s.top() > prices[i])
                    s.pop();
                    
                    if(s.size() == 0)v.push_back(-1);
                    else v.push_back(s.top());
                }
                    
            }
            
          s.push(prices[i]);
        }
        
        reverse(v.begin() , v.end());
        
        for(int i = 0 ; i < n ; i++){
            if(v[i] != -1){
                v[i] = prices[i]-v[i];
            }
            else v[i] = prices[i];
        }
        
        return v ;
    }
};
