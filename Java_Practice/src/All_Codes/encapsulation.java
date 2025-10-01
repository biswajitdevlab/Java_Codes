package All_Codes;

public class encapsulation {
	private String name;

	
public void setname(String name) {
	this.name= name;
}



public String getname() {
	return  name;
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	encapsulation en = new encapsulation();
	en.setname("Rama");
	System.out.println(en.getname());

}
}
