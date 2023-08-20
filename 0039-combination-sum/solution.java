class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        solve(candidates,0,0,target,res,list);
        return res.stream().distinct().collect(Collectors.toList());
    }

    public void solve(int[] a , int i , int sum , int target , List<List<Integer>> res , List<Integer>list){

        if(sum == target){
            List<Integer> check = new ArrayList<>(list);
            Collections.sort(check);
            res.add(new ArrayList<>(check));
            return ;
        }
        if(sum > target) return ;
        if(i == a.length ) return ;

        list.add(a[i]);
        solve(a,i,sum + a[i],target,res,list);
        solve(a,i+1,sum + a[i],target,res,list);
        list.remove(list.size()-1);
        solve(a,i+1,sum,target,res,list);
    }
}
