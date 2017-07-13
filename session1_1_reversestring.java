//session1_1_reversestring
//java

public class Solution {
    public String reverseWords(String a) {
        String [] words = a.split(" ");
        StringBuffer buffer = new StringBuffer();
        for (int i = words.length -1; i >= 0 ; i--) {
            //if (words[i] != " ") {
            if(i == 0 ) {
                buffer.append(words[i]);
            } else {
                buffer.append(words[i] + " ");
            }
            // }
        }
        return buffer.toString();
    }
}

