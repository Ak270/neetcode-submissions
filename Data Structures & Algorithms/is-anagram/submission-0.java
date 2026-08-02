class Solution {
    public boolean isAnagram(String s, String t) {
        
        int n1 = s.length();
        int n2 = t.length();

        if(n1 != n2) return false;

        int[] hp = new int[26];
        int i=0;

        while(i<n1){

            hp[s.charAt(i) - 'a']++;
            hp[t.charAt(i) - 'a']--;
            i++;
        }

        for(int x: hp){
            if(x != 0) return false;
        }

        return true;

    }
}
