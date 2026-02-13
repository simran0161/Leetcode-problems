class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();

        int i=0;

        for(int k:nums){
            mp.put(k,mp.getOrDefault(k,0)+1);
            if(mp.get(k)<=2){
                nums[i]=k;
                i++;
            }
        }
        return i;
    }
}