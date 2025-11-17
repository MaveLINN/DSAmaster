class Solution {
    public boolean kLengthApart(int[] nums, int k) {

        int n = nums.length;
        List<Integer> onesLocations = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 1)onesLocations.add(i);
        }

        for(int i = 1 ; i < onesLocations.size() ; i++){
            if((onesLocations.get(i) - onesLocations.get(i-1)) - 1 < k )
            return false;
        }
        return true;
    }
}
