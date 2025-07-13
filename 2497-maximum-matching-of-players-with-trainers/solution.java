class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int p = players.length ;
        int t = trainers.length ;
        int i = 0 , j = 0 , res = 0;
        while(i < p && j < t){
            if(players[i] <= trainers[j]){
                res++;
                i++;
                j++;
            }else j++;
        }
        return res ;
    }
}

// 4 7 9
// 2 5 8 8
