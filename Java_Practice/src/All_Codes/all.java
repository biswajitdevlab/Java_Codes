package All_Codes;

import java.util.HashSet;

public class all {
		  public static void main(String[]args){
//		    String s = "aeroplane";
//		    HashSet<Character> set = new HashSet<>();
//		    for (char c : s.toCharArray()) {
//		        set.add(c);
//		    }
//		    System.out.println(set);
		   
		    
		    // for(int i=0;i<s.length();i++){
		    //   words[i]
		    // }
			  
			  
			  
			// Java program to count character occurrences 
			// using the Naive Approach
//			        String s = "Program";
//			        char[] ch = s.toCharArray();
//			        boolean[] b = new boolean[s.length()];
//
//			        System.out.println("Character Occurrences:");
//			        for (int i = 0; i < ch.length; i++) {
//			            if (b[i]) continue;     // Skip already counted characters
//			            int c = 1;
//			            for (int j = i + 1; j < ch.length; j++) {
//			                if (ch[i] == ch[j]) {
//			                    c++;
//			                    b[j] = true;     // Mark character as counted
//			                }
//			            }
//			            System.out.println(ch[i] + " : " + c);
//			        }

			  String s = "biswajit";
		        String j = "";
		        int count = 0;

		        for (int i = 0; i < s.length(); i++) {
		            count++;
		            char ch = s.charAt(i);
		            if (ch == 'b' || ch == 'i' || ch == 's' ||
		                ch == 'w' || ch == 'a' || ch == 'j' || ch == 't') {
		                j += ch + String.valueOf(count);
		            }
		        }

		        System.out.println(j);
			    }
		
		  }
		

