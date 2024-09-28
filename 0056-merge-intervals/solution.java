class Solution {
public static int[][] merge(int[][] intervals) {
        List<List<Integer>> list = new ArrayList<>();
        int n = intervals.length;

        Arrays.sort(intervals , new Comparator<int[]>(){
            public int compare(int[] a , int[] b){
                return a[0] - b[0];
            }
        });

        for(int i = 0 ; i < n ; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            if(list.isEmpty()){
                list.add(Arrays.asList(start,end));
            }
            else{
                int x = list.get(list.size()-1).get(0);
                int y = list.get(list.size()-1).get(1);
                if(start >= x && start<=y){
                    list.get(list.size()-1).set(1,Math.max(end,y));
                }else{
                    list.add(Arrays.asList(start,end));
                }
            }

        }

        int[][] res = list.stream().map(l->l.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);
        return res ;
    }
}
