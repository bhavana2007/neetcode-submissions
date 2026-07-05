class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> l=new HashMap<>();

        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String k=new String(c); 
            if(!l.containsKey(k)){
                l.put(k,new ArrayList<>());
            }
            l.get(k).add(s);
        }
        return new  ArrayList<>(l.values());
    }
}
