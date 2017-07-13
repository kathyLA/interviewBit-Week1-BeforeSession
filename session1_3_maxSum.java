//session1_3_Max_Sum
//efficient need to be improve
//java

ppublic class Solution {
    // DO NOT MODFIY THE LIST.
    public int maxSum(List<Integer> a) {
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0 ; i< a.size() ; i++) {
            sum = sum + a.get(i);
            if (sum > max) {
                max = sum;
            }
        }
        
        return max;
    }
    
    public int maxSubArray(final List<Integer> a) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i =0 ; i< a.size() ; i ++) {
            sum = maxSum(a.subList(i,a.size()));
            if(sum > max) {
	               max = sum;
            }
        }
        return max;
    }
    /*int max = Integer.MIN_VALUE;
     int min = Integer.MIN_VALUE;
     int current = 0;
     for (int i = 0 ; i< a.size(); i++) {
     if (a.get(i) >= 0) {
     current = current + a.get(i);
     if (current > max) {
     max = current;
     }
     } else {
     current = 0;
     if (a.get(i) > min) {
     min = a.get(i);
     }
     }
	    }
	    
	    return Math.max(min,max);
     }*/
}
