class Solution {
    public int maxDistToClosest(int[] seats) {
        
    int n = seats.length;
    int res = 0 , l = -1 ;
    
    for(int i = 0 ; i < n ; i++){
        
        if(seats[i] == 1){
            res = l < 0 ? i : Math.max(res , (i-l)/2);
            l = i;
        }
        
    }
    return Math.max(res,n-1-l);
    }
}
