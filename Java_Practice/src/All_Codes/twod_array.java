package All_Codes;

public class twod_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]=new int[2][2];
int count =0;
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length;j++) {
		a[i][j]=count;
		count++;
		
	}
	
}
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length;j++) {
		System.out.print(a[i][j]+" ");
}
	System.out.println(" ");
	}
}
}