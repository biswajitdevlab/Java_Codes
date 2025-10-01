package All_Codes;

public class abstract_class {

	public static void main(String[] args) {
		Maruti m = new Maruti();
		m.speed();
		m.millege();

	}

}
abstract class car{
	public abstract void speed();
	public void millege() {
		System.out.println("Every car have millege greater then 20");
}}
class Maruti extends car{
	@Override
	public void speed() {
		System.out.println("Top speed is 100 km/hr");
	}}
class Suzuki extends car{
	@Override
	public void speed() {

		System.out.println("Top speed is 150 km/hr");
	}
}