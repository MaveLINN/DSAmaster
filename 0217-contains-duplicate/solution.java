class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums.length ;

        for(int i = 0 ; i < n ; i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else mp.put(nums[i],1);
        }

        for(Map.Entry<Integer,Integer> e : mp.entrySet()){
            if(e.getValue()>1)
            return true;
        }
        return false;
    }
}
