import java.io.File;
import java.io.FileInputStream; 
import java.io.IOException;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findTheFile();
		}
catch(IOException e){
	System.out.println("there is no such file");
	e.printStackTrace();
	System.out.println(e);
	
}
	}
	public static void findTheFile() throws IOException{
		
		File newfile=new File("yashist.txt");
		FileInputStream stream=new FileInputStream(newfile);
	}

}
