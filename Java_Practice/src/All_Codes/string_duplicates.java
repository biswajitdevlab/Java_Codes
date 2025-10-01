package All_Codes;

public class string_duplicates {
public static void main(String[]args) {
	String s="Biswajitttttttt";
	for(int i=0;i<s.length();i++) {
		char result=s.charAt(i);
		int count=0;
		if(s.substring(0,i).indexOf(result)!=-1) {
			continue;
		}
		for(int j=0;j<s.length();j++) {
			if(s.charAt(j)==result)
			count++;
		}
	System.out.println(result+" counts are "+ count);
}
	
}}
