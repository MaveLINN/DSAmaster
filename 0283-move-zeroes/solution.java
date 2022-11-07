class Solution {
    public void moveZeroes(int[] nums) {
        int numsSize = nums.length ;

        int idx = 0 ; // this index is used to assign the value in the same array

        for(int i = 0 ; i < numsSize ; i++ ){
            if(nums[i] != 0){  // if value is not equal to 0 then it can be assigned as per the idx value .
                nums[idx++] = nums[i] ;
            }
        }
        // Note : no need to think of the overlapp of numbers 

        for(int i = idx ; i < numsSize ; i++){ 
            nums[i] = 0 ; // once the non-zero value assigned then we need to have zero values in the   array and i will start from the idx value .
        }
    }
}
