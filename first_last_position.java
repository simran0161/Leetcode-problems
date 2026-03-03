class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        int first_idx=-1;

        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                first_idx=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        low=0;
        high=nums.length-1;
        int last_idx=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                last_idx=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        res[0]=first_idx;
        res[1]=last_idx;
        return res;
    }
}