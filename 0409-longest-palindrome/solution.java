class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        int[] dp = new int[256];
        IntStream.range(0,n).forEach(i-> dp[s.charAt(i)]++);
        int sum = Arrays.stream(dp).map(i-> i % 2 == 0 ? i : i - 1).sum();
        boolean checkOdd = Arrays.stream(dp).anyMatch(i -> i % 2 == 1);

        return checkOdd ? sum + 1 : sum ;
    }
}
