package All_Codes;

import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class set {

	public static void main(String[]args) {
		set s =new set();
		s.treeset();
		
	}
	public void treeset() {
		Set <Integer> li=new TreeSet<>();
		for(int i=0;i<5;i++) {
			li.add(i);
		}
		li.add(10);
		li.add(9);
		System.out.println(li.remove(1));
		System.out.println(li.remove(2));
	
		Iterator<Integer> it  = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
