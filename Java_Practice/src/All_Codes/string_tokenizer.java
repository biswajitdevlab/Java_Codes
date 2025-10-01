package All_Codes;
	import java.util.StringTokenizer;

	public class string_tokenizer {
	    public static void main(String[] args) {
	        String str = "Apple,Banana,Orange";
	        StringTokenizer st = new StringTokenizer(str, ",");

	        while (st.hasMoreTokens()) {
	            System.out.println(st.nextToken());
	        }
	    }
	

}
