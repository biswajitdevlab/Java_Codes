package All_Codes;

import java.util.Random;

public class random_number {
public static void main(String[]args) {
	Random rand= new Random();
	int result=0;
	int max=20, min=1;
	for(int i=min;i<max;i++) {
		result=rand.nextInt(i);
	
	}
	System.out.println(result);
}
}
