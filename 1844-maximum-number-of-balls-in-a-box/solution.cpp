class Solution {
public:
   
    int countBalls(int lowLimit, int highLimit) {
        vector<int> v(46) ;
        
        for(int i = lowLimit ; i <= highLimit ; i++){
            v[check(i)]++;
        }
        return *max_element(v.begin() , v.end()) ;
    }
    
    
    int check(int n){
        
        int res = 0 ; 
        while(n){
            res += n%10 ;
            n/=10;
        }
        return res ; 
    }
};
