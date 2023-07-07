class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length ;
        int[] pre = new int[n+1];
        int[] suf = new int[n+1];
        int[] res = new int[n];

        pre[0] = 1 ; suf[n] = 1 ;
        for(int i = 0 ; i < n ; i++){
            pre[i+1] = pre[i]*nums[i];
            suf[n-1-i] = suf[n-i]*nums[n-1-i];
        }

        for(int i = 1 ; i <= n ; i++){
            res[i-1] = pre[i-1]*suf[i];
        }

        return res ;
        // int cz = 0 ;
        // int pro = 1 ;
        // int idx = 0 ;
        // int[] res = new int[nums.length];

        // for(int i = 0 ; i < nums.length ; i++) res[i] = 0 ;

        // for(int i = 0 ; i < nums.length ; i++){
        //     if(nums[i] != 0) pro*= nums[i] ;
        //     else {
        //         cz++ ; idx = i ; pro *= 1 ;
        //     }
        // } 

        // if(cz == 0){
        //     for(int i = 0 ; i < nums.length ; i++){
        //         res[i] = pro/nums[i];
        //     }
        // }else if(cz == 1){
        //     res[idx] = pro ;
        // }

        // return res ;
    }
}
