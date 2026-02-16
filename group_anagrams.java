class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> mp=new HashMap<>();

        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String st=new String(arr);

            if(mp.containsKey(st)){
                mp.get(st).add(s);
            }
            else{
                mp.put(st,new ArrayList<>());
                mp.get(st).add(s);
            }
        }

        for(Map.Entry<String,List<String>> entry:mp.entrySet()){
            res.add(entry.getValue());
        }

        return res;
    }
}