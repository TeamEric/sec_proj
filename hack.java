import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class hack{

public static void main(String[] args) throws IOException{
targetUsers();
}
public static void targetUsers() throws IOException{
 File input=new File("users.txt");
        Scanner fscan=new Scanner(System.in);
        try{
            fscan=new Scanner(input);
        }
        catch(FileNotFoundException e){
            System.out.println(input+" cannot be found!");
        }
	String user ="";	
	while(fscan.hasNext()){
		String s=fscan.nextLine();
		if(!(s.contains("Public")||s.contains("User")||s.contains("Default")||s.contains("."))){
			user+=s+"\n";}}
	try{
            OutputStream output=new FileOutputStream("target.txt");
            PrintStream printOut = new PrintStream(output);
            printOut.print(user);
            System.setOut(printOut);
            System.out.flush();
            printOut.close();
            output.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Cannot write to file.");
        }        
}

}