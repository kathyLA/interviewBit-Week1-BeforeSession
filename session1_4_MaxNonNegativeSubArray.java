//session1_4_MaxNonNegativeSubArray
//java

public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        ArrayList<Integer> result = new ArrayList <Integer> ();
        long sum = 0;
        int s = 0;
        int e = 0;
        int cs = 0;
        int count = 0;
        long max = 0;
        int maxcount = 0 ;
        for (int i = 0 ; i< a.size(); i ++) {
            if (a.get(i) >= 0 ) {
                count ++;
                sum = sum + a.get(i);
                if(sum > max ) {
                    max = sum;
                    s = cs;
                    e = i;
                    maxcount = count;
                } else if ( (sum == max) && (count > maxcount)) {
                    s = cs ;
                    e = i  ;
                    maxcount = count;
                }
            } else {
                cs = i + 1;
                count = 0;
                sum = 0 ;
            }
        }
        if (maxcount > 0) {
            for (int i = s; i <= e ; i++) {
                result.add(a.get(i));
            }
        }      
        return result;
        
    }
}
