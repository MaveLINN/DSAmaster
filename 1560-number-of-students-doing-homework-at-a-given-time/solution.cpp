class Solution {
public:
    int busyStudent(vector<int>& startTime, vector<int>& endTime, int queryTime) {
        const int n = startTime.size() ;
      //  const int m = endTime.size();
        int res = 0 ;
        
        for(int i = 0 ; i < n ; i++){
            if(queryTime >= startTime[i] and queryTime <= endTime[i] ) res++ ;
        }
        return res ; 
    }
};
