package All_Codes;

public class pattern {

	public static void main(String[] args) {
		pattern p =new pattern();
		p.type_1();
		p.type_2();
		p.type_3();
	}
		// TODO Auto-generated method stub
  void type_1() {
	  for(int i=0;i<5;i++) {
		  for (int j=0;j<5;j++) {
			  System.out.print("*");
		  }
		  System.out.println(" ");
	  }
	  
	  
  }
  
  void type_2(){
	  for(int i=0;i<5;i++) {
		  for (int j=0;j<i;j++) {
			  System.out.print("*");
		  }
		  System.out.println(" ");
	  }
  }
  void type_3(){
	  for(int i=5;i>1;i--) {
		  for (int j=i+1;j<5;j++) {
			  System.out.print("*");
		  }
		  System.out.println(" ");
	  }
  }
	

}
