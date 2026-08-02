class Solution {
    public boolean isPalindrome(String s) {
        Integer n = s.length();
        Integer i=0, j=n-1;

        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))) {
                i++; 
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            String l = String.valueOf(s.charAt(i));
            String r = String.valueOf(s.charAt(j));
            if(l.equalsIgnoreCase(r)){
                i++;j--;
            }
            else{
                return false;
            }
        }

        return true;
    }
}
