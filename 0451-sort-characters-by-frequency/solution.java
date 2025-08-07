class Solution {
    public String frequencySort(String s) {
        int[][] has = new int[256][2];

        for(int i = 0 ; i < 256 ; i++) has[i][1] = 0 ;

        for(int i = 0 ; i < s.length() ; i++){
            has[s.charAt(i)][0] = s.charAt(i);
            has[s.charAt(i)][1]++;
        }

        Arrays.sort(has,(a,b)->b[1] - a[1]);
        String res = "";
        for(int i = 0 ; i < 256 ; i++){
            for(int j = 0 ; j < has[i][1] ; j++){
                res += (char)has[i][0] ;
            }
        }

        return res ;
    }
}
