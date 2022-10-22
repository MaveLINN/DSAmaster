class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(mp.get(target-nums[i]) != null){
                res[0] = i ;
                res[1] = mp.get(target-nums[i])-1;
            }
            mp.put(nums[i],i+1);
        }
        return res ;
    }
}
