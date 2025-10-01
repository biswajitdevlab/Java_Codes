package All_Codes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class duplicate_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = {1, 2, 3, 4, 5, 4, 2, 3,4,5};

	        for (int i = 0; i < a.length; i++) {
	            if (a[i] == -1) {           // Skip if already marked
	                continue;
	            }

	            int count = 1;              // Start at 1 for a[i] itself

	            for (int j = i + 1; j < a.length; j++) {
	                if (a[i] == a[j]) {
	                    count++;
	                    a[j] = -1;          // Mark duplicate so it isn’t counted again
	                }
	            }

	            if (count > 1) {
	               // System.out.println(a[i] + " occurs " + count + " times");
	            }
	}
		
//2nd approach		

        int[] arr = {1, 2, 3, 4, 5, 4, 2, 3};

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Print only those with count > 1
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                //System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
            }
        }
        
//again
       
    int c[]= {1,2,3,4,4,5,6,6,7,8};
    for(int i=0;i<c.length;i++) {
    	if(c[i]==-1) {
    		System.out.print("They are"+ c[i]);
    		continue;
    		
    	}
    	int count=1;
    	
    	for(int j=i+1;j<c.length;j++) {
    		if(c[i]==c[j]) {
    			count++;
    		c[j]=-1;
    	}
    		
    	}
    	//if(count>1) 
    		System.out.println(c[i]+" "+count);
    	
    }
	
	}}
