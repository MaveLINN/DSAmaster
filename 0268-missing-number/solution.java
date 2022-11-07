class Solution {
    public int missingNumber(int[] nums) {
        final int numsSize = nums.length ;
        int sum = 0 ;
        for(int i = 0 ; i < numsSize ; i++){ // summation in array
            sum += nums[i]; 
        }

        int check = numsSize*(numsSize + 1 )/2 ;  // sum of n terms
        if(check == sum) return 0 ; // if both the sum and check are equal then the missing number is 0
        else return check - sum ;    // else the mising number is check - sum .

    }
}
