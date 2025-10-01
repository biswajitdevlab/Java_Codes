package All_Codes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file_operation {
	public static void main(String[]args) throws IOException {
		file_operation f = new file_operation();
		f.file_creation();
	}
	public void file_creation() throws IOException {
	String path="";
File f = new File(path);
if(f.createNewFile()){
	System.out.println("File created");
}
else {
	System.out.println("File alreday exist");
}
	}
	
	 public void filewrite() {
	        String file = "Hello World!";//inside the text file it will show.
	        try {
	            FileWriter fWriter = new FileWriter("C:\\Users\\soyeb\\Documents\\B.txt");
	            fWriter.write(file);
	            System.out.println(file);
	            fWriter.close();
	            System.out.println("File is created");
	            System.exit(0);
	        }
	        catch (IOException e) {
	            System.out.print(e.getMessage());
	        }
	        finally{
	            System.out.println("Successfully written");
	        }
	    }	

}