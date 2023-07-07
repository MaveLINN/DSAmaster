class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int mx = 0 ;
        int n = candies.length ;
        List<Boolean> res = new ArrayList<>();

        for(int i = 0 ; i  < n ; i++){
            mx = Math.max(mx,candies[i]);
        }

        for(int i = 0 ; i < n ; i++){

            if(extraCandies + candies[i] >= mx)
                res.add(true);
            else res.add(false);    
            
        }

        return res ;
    }
}
