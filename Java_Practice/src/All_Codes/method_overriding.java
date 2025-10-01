package All_Codes;

public class method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape s  = new square();
s.draw();

	}

}

class Shape {
	void draw() {
		System.out.println("Every object have some shape");
	}
}

class square extends Shape {
	@Override
	void draw() {
		super.draw();
		System.out.println("Square have 4 sides");
	}
}
