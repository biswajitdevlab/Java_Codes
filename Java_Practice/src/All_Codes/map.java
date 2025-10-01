package All_Codes;

public class map {

	public static void main(String[] args) {
		java.util.Map<Integer, String> m= new java.util.HashMap<>();
		m.put(1,"rama");
		m.put(2, "hari");
		m.put(3, "akash");
		m.put(4, "sahoo");
System.out.println(m.get(2));
System.out.println(m);
for(java.util.Map.Entry<Integer, String> e: m.entrySet()) {
	System.out.println(e.getKey()+ " "+e.getValue());
}
	}

}
