class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n];
        if(n > 0)
            dp[0] = 1;
        else
            return 0;
        
        if(n > 1)
            dp[1] = 1;
        else
            return 1;
        return climbStairs(n-1, dp) + climbStairs(n-2, dp);
    }

    public int climbStairs(int n, int[] dp) {
        if (dp[n] == 0 && n != 0) {
            dp[n] = climbStairs(n-1, dp) + climbStairs(n-2, dp);
        }
        return dp[n];
    }
}
