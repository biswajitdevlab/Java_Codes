package All_Codes;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		int a,b;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter a choice: ");
		int c=sc.nextInt();
		switch(c){
		case 1:
			System.out.println(c=a+b);
			break;
		case 2:
			System.out.println(c=a-b);
			break;
		case 3:
			System.out.println(c=a*b);		
			break;
		case 4:
			System.out.println(c=a/b);
			break;
	    default:
	    	System.out.println("Invalid choice");
			
		}
	}

}
