class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for(int i = 0; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                Set<Long> hashset = new HashSet<>();
                for(int k = j + 1 ; k < n ; k++){
                    long sum = nums[i]+nums[j];
                    sum += nums[k];
                    long fth = target - sum;
                    if(hashset.contains(fth)){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add((int)(fth));
                        Collections.sort(list);
                        st.add(list);
                    }
                    hashset.add((long)nums[k]);
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>(st);
        return res;

    }
}
