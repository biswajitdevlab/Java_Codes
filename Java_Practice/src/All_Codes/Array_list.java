package All_Codes;

import java.util.ArrayList;
import java.util.List;

public class Array_list {

	public static void main(String[] args) {
	List<Integer> li=new ArrayList<>();
	for(int i=0;i<5;i++) {
		li.add(i);
	}
	System.out.println(li);
	li.remove(2);
	System.out.println(li);
	
	}
	}