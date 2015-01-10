import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class createMaster{

public static void main(String[] args) throws IOException{makeBat();}

public static void makeBat() throws IOException{
File input=new File("batchFs.txt");
        Scanner fscan=new Scanner(System.in);
        try{
            fscan=new Scanner(input);
        }
        catch(FileNotFoundException e){
            System.out.println(input+" cannot be found!");
        }

	String execute="";
	while(fscan.hasNext()){
		String s=fscan.nextLine();
		execute+=s+"\n";
	}

	String clean="del -q -f sethc.exe\n"
		+"rename -q -f sethc1.exe sethc.exe";

	String batch=execute+"\n"+clean;

	


	try{
            OutputStream output=new FileOutputStream("master.bat");
            PrintStream printOut = new PrintStream(output);
            printOut.print(batch);
            System.setOut(printOut);
            System.out.flush();
            printOut.close();
            output.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Cannot write to file.");
        }        
}}
