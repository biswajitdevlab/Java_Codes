package All_Codes;

public class fibonicci {

	public static void main(String[] args) {
		fibonicci f = new fibonicci();
		System.out.println(f.fibonicci(10));
		f.method_2();
	}
		static int fibonicci(int n) {
			if(n==0 ||n==1) {
				return n;
				
			}
			else {
				return fibonicci(n-1)+ fibonicci(n-2);
			}
			
		}

	public void method_2() {
		int a=0,b=1;
		int c=0;
		for(int i=0;i<10;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" , ");
		}
	
	System.out.println(" ");

}
}
