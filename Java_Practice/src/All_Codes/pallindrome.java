package All_Codes;

import java.util.Scanner;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a,b=0,c;

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		c=n;
		while(n>0) {
			a=n%10;
			b=b*10+a;
			n=n/10;
		}
		if(b==c) {
			System.out.println("Pallindrome");
		}
		else{
			System.out.println("Not Pallindrome");
		}
			
	}

}
