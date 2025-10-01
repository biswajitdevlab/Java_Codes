package All_Codes;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
     int a= 10;
     int b =12;
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println(a+" "+b);
     */
	practice p= new practice();
	//System.out.println(p.fibonicci(10));
	//System.out.println(p.recursion(5));
	//p.num_reverse();
	//p.armstrong();
//	p.vowel();
//	p.prime();
//	p.sorting();
	p.string_immutable();
	}
	/*
	int recursion(int n) {
    if (n==1||n==0) {
    	return 1;
    }
    return n * recursion(n-1);
	}
	int fibonicci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fibonicci(n-1) + fibonicci(n-2);
	}
	//number reverse
	void num_reverse() {
	int n,a,b=0, c;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number");
	n=s.nextInt();
	c=n;
	while(n>0) {
		a=n%10;
		b=b*10+a;
		n=n/10;
	}
	if(b==c) {
		System.out.println("The number is pallindrome and reverse is" + b);
	}
	else
		
	{
		System.out.println("The number is not pallindrome and reverse is" + b);
	}
	}
	//armstrong number
	void armstrong(){
		
	int a,b=0,c,n;
	Scanner sc = new Scanner(System.in);
	
	n=sc.nextInt();
	c=n;
	while(n>0) {
		a=n%10;
		b=b+(a*a*a);
		n=n/10;
	}
	if(b==c) {
		System.out.println("The number is armstrong" + c);
	}
	else
		
		{
			System.out.println("The number is not armstrong" + c);
		}
	}
	
	//vowel
	void vowel() {
	String v="Biswajit";
	v=v.toLowerCase();
	int count =0;
	for(int i=0;i<v.length();i++) {
	 if(v.charAt(i)=='a'||v.charAt(i)=='e'||v.charAt(i)=='i'||v.charAt(i)=='o'||v.charAt(i)=='u') {
		count++; 
		
	}
	
	}
	System.out.println(count);
	}
	//prime number
	void prime() {
	
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int n = s.nextInt();
		        boolean isPrime = true;

		        if (n <= 1) {
		            isPrime = false;  // 0 and 1 are not prime
		        } else {
		            for (int i = 2; i <= n / 2; i++) {
		                if (n % i == 0) {  // divisor found
		                    isPrime = false;
		                    break;
		                }
		            }
		        }

		        if (isPrime) {
		            System.out.println(n + " is Prime");
		        } else {
		            System.out.println(n + " is Not Prime");
		        }
		    }

		   
	//sorting array
	void sorting() {
	int a[]= {2,4,5,8,3};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	}
	*/
	void string_immutable(){
	//string are immutable
	String a="abc";
	String b="ab";
	System.out.println(a==b);
}
}
