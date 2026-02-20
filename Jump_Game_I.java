class Solution {
    public boolean solve(int i, int[] nums,Boolean[] dp){
        if(i==nums.length-1) return true;
        if(i>=nums.length) return false;
        if(dp[i]!=null){
            return dp[i];
        }

        for(int j=1;j<=nums[i];j++){
            if(solve(i+j,nums,dp)){
                return dp[i]= true;
            }
        }
        return dp[i]= false;
    }
    public boolean canJump(int[] nums) {
        Boolean[] dp=new Boolean[nums.length];
        return solve(0,nums,dp);
    }
}