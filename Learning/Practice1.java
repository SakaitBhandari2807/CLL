//Problem Statement: Given a denominations of coin Find the number of ways to calculate the sum N

class Practice1 {
    public static void main(String args[]){
        new Practice1().solve(3,new int[]{2});
        new Practice1().solve(5,new int[]{1,2,5});
        new Practice1().solve(10,new int[]{10});
        new Practice1().solve(5,new int[]{1,3,4});
        new Practice1().solve(12,new int[]{1,5,10});
    }
    public int solve(int amount,int []coins){
        int unique_coins = coins.length;
        int dp[] = new int[amount+1];
        dp[0] = 1;
        for(int i=1;i<=amount;i++){
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] += dp[i - coin];
                }
            }
        }
        System.out.println(dp[amount]);
        return dp[amount];
    }
}
