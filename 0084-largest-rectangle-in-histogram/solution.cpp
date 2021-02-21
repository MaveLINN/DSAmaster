class Solution {
public:
    int largestRectangleArea(vector<int>& a) {
     
        const int n = a.size();
        
    vector<int> snl , snr ;
    stack<pair<int,int>>s ;
    
    for(int i = 0 ; i < n ; i++){
        
        if(s.size() == 0){
            snl.push_back(-1);
        }    
        else{
            
            if(s.size() > 0 and s.top().first < a[i])snl.push_back( s.top().second ) ;
            else{
                
                while(s.size() > 0 and s.top().first >= a[i]){
                    s.pop();
                }
                if(s.size() == 0)snl.push_back(-1);
                else{
                    snl.push_back(s.top().second);
                }
                
            }
        }
        
        s.push({a[i],i});
        
    }
    
    while(!s.empty())s.pop();
    
        for(int i = n-1 ; i >= 0 ; i--){
        
        if(s.size() == 0){
            snr.push_back(n);
        }    
        else{
            
            if(s.size() > 0 and s.top().first < a[i])snr.push_back( s.top().second ) ;
            else{
                
                while(s.size() > 0 and s.top().first >= a[i]){
                    s.pop();
                }
                if(s.size() == 0)snr.push_back(n);
                else{
                    snr.push_back(s.top().second);
                }
                
            }
        }
        
        s.push({a[i],i});
        
    }
    
    reverse(snr.begin(),snr.end());
    
    int res = -1 ;
    
    for(int i = 0 ; i < n ; i++){
        res = max( res , a[i]*(snr[i] - snl[i] - 1));
        
    }
    
    return res ; 
    }
};
