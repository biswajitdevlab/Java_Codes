package All_Codes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linked_list {
	public static void main(String[]args) {
	LinkedList<Integer> li=new LinkedList<>();
	for(int i=0;i<5;i++) {
		li.add(i);
	}
	System.out.println(li.peekLast());
	System.out.println(li.peekFirst());
	System.out.println(li.get(3));
	Iterator<Integer> it  = li.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
