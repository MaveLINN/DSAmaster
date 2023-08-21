class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        solve(nums,st,list,0);

        for(List<Integer> i : st ){
            res.add(i);
        }
        return res ;
    }

    public void solve(int[] a , Set<List<Integer>> st , List<Integer> list , int i){

        if(i == a.length){
            List<Integer> check = new ArrayList<>(list);
            Collections.sort(check);
            st.add(check);
            return ;
        }

        list.add(a[i]);
        solve(a,st,list,i+1);
        list.remove(list.size() - 1);
        solve(a,st,list,i+1);


    }
}
