class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& t) {
        const int n = t.size() ;
        stack<pair<int,int>> s ;
        vector<int> v ;
        
        for(int i = n - 1; i >= 0 ; i--){
            
            if(s.size() == 0)v.push_back(i);
            else if(s.size() > 0 && s.top().first > t[i])
                v.push_back(s.top().second);
            else if(s.size() > 0 && s.top().first <= t[i]){
                while(s.size() > 0 && s.top().first <= t[i])s.pop();
                
                if(s.size() == 0 )v.push_back(i);
                else v.push_back(s.top().second);
            }
            s.push({t[i],i});
        }
        
        for(auto i : v) cout << i << "   " ;
        cout << endl;  
        
        reverse(v.begin() , v.end());
        
        for(auto i : v) cout << i << "   " ;
        cout << endl;  
        for(int i = 0 ; i < n ; i++){
            v[i] -= i;
        }
        return v ;
    }
};
