class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0;
        int r=0;
        int res=0;
        HashMap<Character,Integer>mp=new HashMap<>();

        while(r<n){
            if(mp.containsKey(s.charAt(r))){
                if(mp.get(s.charAt(r))>=l){
                    l=mp.get(s.charAt(r))+1;
                }
            }
            int len=r-l+1;
            res=Math.max(res,len);
            mp.put(s.charAt(r),r);
            r++;
        }
        return res;
    }
}