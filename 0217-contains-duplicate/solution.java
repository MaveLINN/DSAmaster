class Solution {
    public boolean containsDuplicate(int[] nums) {
        
    Map<Integer,Integer> mp = new HashMap<>();
    
    for(int i = 0 ; i < nums.length ; i++){
        if(mp.containsKey(nums[i])){ // checking if the key is already exists
            mp.put(nums[i] , mp.get(nums[i]) + 1);
        }
        else mp.put(nums[i] , 1);
    }

    for(Map.Entry<Integer,Integer> i : mp.entrySet()){
        if(i.getValue() > 1) return true ; // if any value greater than 1 means duplicate exists .
    }
    return false ;    
    }
}
