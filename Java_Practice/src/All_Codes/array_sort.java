package All_Codes;

import java.util.Arrays;

public class array_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,5,6,8,2,9};
for(int i=0;i<a.length;i++) {
	int result =a[i];
	System.out.print("\n"+a[i]);
}
Arrays.sort(a);
for(int j:a) {
	System.out.println(j);
}
	}

}
