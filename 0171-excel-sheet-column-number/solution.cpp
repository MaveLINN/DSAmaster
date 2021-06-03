class Solution {
public:
    int titleToNumber(string columnTitle) {
        const int n = columnTitle.size();
        
        int ans = 0 , res = (int)columnTitle[n-1] - 64;
        if(n < 2)return res;
        
        for(int i = 0 ; i < n - 1 ; i++){
            int k = (int)columnTitle[i] - 64;
            ans += k*powl(26,n-i-1) ;
        }
        return res+ans;
    }
};
