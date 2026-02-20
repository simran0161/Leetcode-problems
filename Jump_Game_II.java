class Solution {
    public int solve(int i, int[] nums,int[] dp){
        if(i>=nums.length-1){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }

        int count=Integer.MAX_VALUE;
        for(int j=1;j<=nums[i];j++){
            int val=solve(i+j,nums,dp);
            if(val!=Integer.MAX_VALUE){
                count=Math.min(count,val+1);
            }
        }
        return dp[i]= count;
    }
    public int jump(int[] nums) {
        int[]dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(0,nums,dp);
    }
}