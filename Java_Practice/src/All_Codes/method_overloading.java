package All_Codes;

public class method_overloading {
	public static void main(String[]args) {
		method_overloading m= new method_overloading();
		System.out.println(m.add(10, 20));
		System.out.println(m.add(10,20, 30));
	}
static int add(int a , int b) {
	return a+b;
}
static int add(int a,int b, int c) {
	return a+b+c;
}
}