class Solution {
public:
    int countStudents(vector<int>& students, vector<int>& sandwiches) {
        
        const int n = students.size();
        const int m = sandwiches.size();
        
        int res = m ;
        int dp[2]={0};
        for(int i = 0 ; i < n ; i++ )dp[students[i]]++;
        
        for(int i = 0 ; i < n ; i++ ){
            if(dp[sandwiches[i]]){ dp[sandwiches[i]]--; res-- ;}
            else {
                return res ;
            }
        }
        
        return res ;
    }
};
