package All_Codes;

public class exception {
	public static void main(String[]args) {
	int a=10,b=0,c;
	try {
		c=a/b;
		System.out.println("c");
	}
	catch(Exception e){
		System.out.println(e.getMessage( ));
		//System.out.println(e.printStackTrace());
		
	}
	}

}
