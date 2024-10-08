class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(nums,0,res,list) ;
        return res.stream().distinct().collect(Collectors.toList());// to get the distinct list
    }

    public void solve(int[] a , int i , List<List<Integer>> res , List<Integer> list){
        if(i == a.length ){
           List<Integer>check = new ArrayList<>(list);
           Collections.sort(check);
            res.add(new ArrayList<>(check)) ;
            check.clear();
            return;
        }

        list.add(a[i]);    
        solve(a,i+1,res,list);
        list.remove(list.size()-1);
        solve(a,i+1,res,list);

    }
}
