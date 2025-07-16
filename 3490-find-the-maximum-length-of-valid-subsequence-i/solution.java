class Solution {
    public int maximumLength(int[] nums) {
        int check = nums[0]%2 ,odd = 0 , even = 0 , both = 0 ;

        for(int x : nums){
            if(x%2 == 0) even++;
            else odd++;

            if(x%2 == check){
                both++;
                check = 1-check;
            }
        }
        int ans = Math.max(both,Math.max(odd,even));

        return  ans;
    }
}
