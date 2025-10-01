package All_Codes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class vector {
	public static void main(String[]args) {
		Vector<Integer> li=new Vector<>();
		for(int i=0;i<5;i++) {
			li.add(i);
		}
		System.out.println(li);
		Iterator<Integer> it  = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
