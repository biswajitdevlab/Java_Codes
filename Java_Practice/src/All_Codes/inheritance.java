package All_Codes;

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C b =new C();
		b.welcome();
		b.display();
		b.welcome1();
		

	}

}

//Single - one child and one parent
//multiple - multiple parent class and one child class
//multi level - level by lavel child classes
//hiererchical - one parent and multiple child and each inherit at same time
class A {
	void display() {
		System.out.println("Are you good");
	}
	
}
class B extends A {
	void welcome() {
		System.out.println("Welcome to china");
	}
}

class C extends B {
	void welcome1() {
		System.out.println("Welcome to india");
	}
}




