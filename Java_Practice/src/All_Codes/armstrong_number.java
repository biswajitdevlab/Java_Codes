package All_Codes;

import java.util.Scanner;

public class armstrong_number {
	public static void main(String[]args) {
int n =153;
int a,p=0,c;
c=n;
while(n>0) {
	a=n%10;
	p=p+(a*a*a);
	n=n/10;
}
if(p==c) {
	System.out.println("The number is armstrong");
}
else {
	System.out.println("Not armstrong");
}
	}

}
