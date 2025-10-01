package All_Codes;

public class prime_number {
public static void main(String[]args) {
	int num=11;
	boolean flag=false;
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
		flag=true;
		break;
		
	}
}
	if(!flag) {
		System.out.println("The number is prime");
	}
	else {
		System.out.println("The number is not prime");
	}
}
}

