class Solution {
    public int longestConsecutive(int[] nums) {
    int n = nums.length ;

    if(n==0) return 0 ;

    Arrays.sort(nums);
    int streak = 1 ; 
    int val = nums[0];
    int res = 1 ;

    for(int i = 1 ; i < n  ; i++){

        if(nums[i] != val){
            if(nums[i] == val + 1){
                streak++;
            }
            else streak = 1 ;
            res = Math.max(res,streak);
            val = nums[i] ;
        }
    }


    return res ; 
    }
}
