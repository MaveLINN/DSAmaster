class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        
        int ctz = 0 ; 
        int pro = 1 ;

        for(auto &i : nums){
            if(i != 0){
             pro*= i;
            }else ctz++ ;
        }

        vector<int> res(nums.size() , 0) ;
        if(ctz > 1) return res ;
        else if( ctz == 1){

            for(int i = 0 ; i < nums.size() ; i++){
                if(nums[i] != 0 ){
                    res[i] = 0 ;
                }
                else res[i] = pro;
            }

        }
        else {
            for(int i = 0 ; i < nums.size() ; i++){
                res[i] = pro/nums[i];
            }

        }
        return res ;

    }
};


