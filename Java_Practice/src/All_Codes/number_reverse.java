package All_Codes;

public class number_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=120;
int a,b=0,c;

c=n;
while(n>0) {
	a=n%10;
	b=b*10+a;
	n=n/10;
}
System.out.println("Reverse of the number is: "+ b);

	}

}
