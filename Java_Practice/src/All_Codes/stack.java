package All_Codes;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class stack {

	public static void main(String[]args) {
		Stack <Integer> li=new Stack<>();
		for(int i=0;i<5;i++) {
			li.push(i);
		}
		System.out.println(li.pop());
		System.out.println(li.pop());
	
		Iterator<Integer> it  = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	}

