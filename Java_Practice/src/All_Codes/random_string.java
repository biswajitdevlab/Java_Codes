package All_Codes;

import java.util.UUID;

public class random_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Random_word=UUID.randomUUID().toString().replaceAll("-","").substring(0,3);
System.out.println(Random_word);
	}

}
