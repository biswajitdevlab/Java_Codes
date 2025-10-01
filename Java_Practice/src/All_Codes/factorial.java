package All_Codes;

public class factorial {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
	factorial f = factorial.class.newInstance();
	System.out.println(f.first_approach(5));
	f.second_approach(5);
	

	}
	static int first_approach(int n) {
		if (n==1 || n==0) {
			return 1;
		}
		return n * first_approach(n-1);
}
	static void second_approach(int n) {
		int result =1;
		for(int i=1;i<=n;i++) {
			result =result*i;
		
		}
		System.out.println(result);
	}
}