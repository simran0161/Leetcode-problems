class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
            if(mp.get(i)>Math.floor(n/2)){
                return i;
            }
        }
        return -1;
    }
}