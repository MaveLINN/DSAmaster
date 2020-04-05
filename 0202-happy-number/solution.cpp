class Solution {
    int ret(int n){
        int sum = 0 ; 
        while(n){
            sum += (n%10)*(n%10);
            n/=10;
        }
        return sum ;
    }
    
public:
    bool isHappy(int n) {
        unordered_set<int>vis ; 
        int gg = 810 ;
        while(gg--){
            if(n == 1)return true ;
            n = ret(n);
            if(vis.count(n))return false ;
            vis.insert(n);
        }
        return false ;
    }
};
