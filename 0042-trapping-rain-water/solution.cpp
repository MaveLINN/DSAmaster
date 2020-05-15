class Solution {
public:
    int trap(vector<int>& v) {
        const int n = v.size();
        
        if( n == 0)return 0 ;
        
        int a[n],b[n];
        memset( a , 0 , sizeof a);
        memset( b , 0 , sizeof b);
        
        a[0] = v[0] ; b[n-1] = v[n-1] ;
        for(int i = 1 ; i < n ; i++){
	    a[i] = max( v[i], a[i-1]);
        }

         for(int i = n-2 ; i >= 0 ; i--){
	    b[i] = max( v[i], b[i+1]);
        }
        
        int ret = 0 ; 
        for(int i = 0 ; i < n ; i++){
            ret += ( min(a[i],b[i]) - v[i]);
        }

        return ret ;
    }
};
