class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];    // creating result array , initially empty
        int idxp = 0 , idxn = 0;             // two pointers as we know the positive(2*i) and negative(2*i + 1) jumps for i = 0 ;
        
        for(int i = 0 ; i < nums.length ; i++){ // whatever value we are getting, storing it as per +/- and increment that part only 
            if(nums[i] >= 0){
                res[2*idxp] = nums[i];
                idxp++;
            }
            else{
                res[2*idxn + 1] = nums[i];
                idxn++;
            }
        }
        return res; // final result
    }
}
