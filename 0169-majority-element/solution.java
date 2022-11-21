class Solution {
    public int majorityElement(int[] nums) {
        
        int arraySize = nums.length ;

        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){ // maintaining the map .
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i]) + 1);
            }
            else mp.put(nums[i] , 1);
        }

        for(Map.Entry<Integer,Integer> i : mp.entrySet()){ // traversing the map .
            if(i.getValue() > arraySize/2)return i.getKey();
        }

        return 0 ;

    }
}
