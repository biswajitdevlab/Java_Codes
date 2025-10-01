package All_Codes;

import java.util.Arrays;

public class anagrams {
	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";

	        // Remove spaces and convert to lowercase
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();

	        // Convert strings to char arrays
	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();

	        // Sort the arrays
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        // Check if arrays are equal
	        if (Arrays.equals(arr1, arr2)) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are NOT anagrams.");
	        }
	    }
	}


