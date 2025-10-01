package All_Codes;

public class throw_throws {

	public static void main(String[] args) {
		throw_throws ex= new throw_throws();
		ex.exception();
	}
		public void exception ()throws ArithmeticException {
			int a=10,b=0,c;
			
			try {
				if(b==0) {
				throw new ArithmeticException("Divion by zero is not allowed");
				}
				c=a/b;
				
			System.out.println(c);
			
		}
			catch(Exception e){
				throw e;
			}
		}
	}


