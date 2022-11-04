class Solution {
    public int removeDuplicates(int[] nums) {

        int x = 1 ; // first value is fixed , we need to work on duplicates . then next different value starts from index 1 ( second element )
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] != nums[i-1]) nums[x++] = nums[i] ;  // if consecutive elements matched , it means we don't need to do anything , and if unmatched it means we get the new element which needs to be assigned on the given current index (x)
        }
        return x ; // this the value of different element without duplicates , after this index duplicacy starts in array .
    }
}
