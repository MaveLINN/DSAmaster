class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int nums1Size = nums1.length ;
        int nums2Size = nums2.length ;

        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0 ; i < nums1Size ; i++){
            if(mp.containsKey(nums1[i])){ // containsKey return true if element present in the map else false . 
                mp.put(nums1[i],mp.get(nums1[i]) + 1);
            }else mp.put(nums1[i],1);
        }

        for(int i = 0 ; i < nums2Size ; i++){
            if(mp.containsKey(nums2[i]) && mp.get(nums2[i]) > 0 ){
                result.add(nums2[i]);
                mp.put(nums2[i],mp.get(nums2[i]) - 1);
            }
        }

        int[] res = new int[result.size()];
        for(int i = 0 ; i < result.size() ; i++ ) {
        	res[i] = result.get(i);
        }
        return res ;

    }
}
