//session1_2_Palindrome
//java

public class Solution {
    public int isPalindrome(String a) {
        String ls = a.toLowerCase();
        int n = a.length();
        
        int begin =0;
        int end = n -1 ;
        while (begin <= end) {
            if ( ls.charAt(begin) == ls.charAt(end)) {
                begin ++;
                end --;
            } else if ( !Character.isLetter( ls.charAt(begin)) && !Character.isDigit(ls.charAt(begin))) {
                begin ++;
            } else if ( !Character.isLetter( ls.charAt(end)) && !Character.isDigit(ls.charAt(end))) {
                end --;
            } else {
                return 0;
            }
        }
        return 1;
    }
}
