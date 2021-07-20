class Solution {
public:
    int maxDistToClosest(vector<int>& seats) {
        const int n = seats.size();
        int res = 0 , l = -1;
        for(int i = 0 ; i < n ; i++){
            if(seats[i] == 1){
                res = l < 0 ? i : max(res, (i-l)/2) ;
                l = i ;
            }
        }
        
        return max(res,n-1-l);
    }
};
