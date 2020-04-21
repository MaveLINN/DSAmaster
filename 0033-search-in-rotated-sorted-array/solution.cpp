class Solution {
public:
    int search(vector<int>& v, int x) {
        int res = -1 ;
        
        int l = 0 , h = v.size() - 1 , m ;
        while( l <= h){
            m = l + (h - l)/2 ;
            
            if(v[m] == x )return res = m ;
            
            bool d1 = v[m] >= v[0] ;
            bool d2 = x >= v[0] ;
           if( d1 == d2){
               if(v[m] >= x){
                   h = m - 1;
               }else l = m + 1;
           }
            else{
                if( d1){
                    l = m + 1 ;
                }else  h = m -1 ;
                
            }
               
        }
     return res ;    
    }
};
