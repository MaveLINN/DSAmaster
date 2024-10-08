class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(nums,0,res,list);
        return res.stream().distinct().collect(Collectors.toList()); // to find distinct lists
    }
    
        public static void solve(int[] a , int idx , List<List<Integer>> res ,List<Integer> list ){
        if(idx == a.length){
            List<Integer> temp = new ArrayList<>(list);
            Collections.sort(temp);
            res.add(temp);
            return;
        }
        list.add(a[idx]);
        solve(a,idx+1,res,list);
        list.remove(list.size() - 1 );
        solve(a,idx+1,res,list);
    }
}
