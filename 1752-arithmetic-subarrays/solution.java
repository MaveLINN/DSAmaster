class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        int q = l.length ;
        List<Boolean> res = new ArrayList<>();

        for(int i = 0 ; i < q ; i++){
            boolean check = true ;

            List<Integer> list = new ArrayList<>();  
            for(int j = l[i] ; j <= r[i] ; j++){
                list.add(nums[j]);
            }
            Collections.sort(list);

            int diff = list.get(1) - list.get(0);

            for(int j = 1 ; j < list.size() - 1 ; j++){

                if((list.get(j+1) - list.get(j)) != diff ){
                    check = false ;
                    break ;
                }
            }
            list.clear();
            res.add(check);

        }
        return res;
    }
}
