package All_Codes;

import java.util.UUID;

public class random_email {

	    public static void main(String[] args) {
	        // Generate random string for email
	        String username = "user" + UUID.randomUUID().toString().substring(0, 5);
	        String domain = "example.com";
	        
	        String email = username + "@" + domain;

	        System.out.println("Random Email ID: " + email);
	    }
	}
