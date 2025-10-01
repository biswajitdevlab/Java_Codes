package All_Codes;

public interface Interface_Implementation {
	public abstract void speed();
	public abstract void millege() ;
}


class Maruti1 implements Interface_Implementation {
public void speed() {
	System.out.println("Top speed is 100 km/hr");
}

@Override
public void millege() {
	// TODO Auto-generated method stub
	System.out.println("20 km/hr");
}}


class Suzuki1 implements Interface_Implementation{
	@Override
public void speed() {

	System.out.println("Top speed is 150 km/hr");
}
public void millege() {
	System.out.println("22 km/hr");
}
}


class d { 
public static void main(String[] args) {
	Maruti1 m = new Maruti1();
	m.speed();
	m.millege();

}

}