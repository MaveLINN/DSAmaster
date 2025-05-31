class Solution {
    public int[] twoSum(int[] a , int target){
        int[] res = new int[2];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0 ; i < a.length ; i++){
            if(mp.containsKey(target - a[i])){
                res[1] = i ;
                res[0] = mp.get(target - a[i]);
            }
            mp.put(a[i],i);
        }
        return res ;
    }
}
