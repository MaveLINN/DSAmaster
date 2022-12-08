class Solution {
    public int singleNumber(int[] nums) {
        int res = 0 ;
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(mp.containsKey(nums[i])){ // checking if it is  present in map 
                mp.put(nums[i],mp.get(nums[i])+1);    // if present adding 1 to existing value
            }else mp.put(nums[i],1);                  // if not present , mapping 1 to key 
        }

        for(Map.Entry<Integer,Integer> i : mp.entrySet()){
            if(i.getValue() == 1){
                res = i.getKey();
                break;
            }
        }
        return res ;
    }
}
