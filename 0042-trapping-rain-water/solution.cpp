class Solution {
public:
    int trap(vector<int>& height) {
        
        const int n = height.size();
        if(!n)return 0 ;
        vector<int> vl(n) , vr(n) ; // left array and right array 
        
        vl[0] = height[0] , vr[n-1] = height[n-1];
        for(int i = 1 ; i < n ; i++ ){
            vl[i] = max(height[i],vl[i-1]); // finding the left max including                                                       current value 
        }
        
        for(int i = n-2 ; i >= 0 ; i-- ){
            vr[i] = max(height[i],vr[i+1]); // finding the right max including the                                                  current value 
        }
        
        int result = 0 ;
        
        for(int i = 0 ; i < n ; i++){
            result += abs( min(vr[i],vl[i])  - height[i]) ;
        }
        
        return result ;
    }
};
