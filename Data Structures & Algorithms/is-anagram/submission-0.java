class Solution {
    public boolean isAnagram(String s, String t) {
        char ch[]=s.toCharArray();
        char pr[]=t.toCharArray();
        int n=ch.length;
        int m=pr.length;

        if(n!=m){
            return false;
        }
        Arrays.sort(ch);
        Arrays.sort(pr);

        for(int i=0;i<n;i++){
        if(ch[i]!=pr[i]){
            return false;
        }
    }
        return true;
    }
}
