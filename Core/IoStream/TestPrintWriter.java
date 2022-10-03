package Core.IoStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriter {
public static void main(String[] args) throws IOException{
	FileWriter out =new FileWriter("C:\\Users\\Rays-2\\Desktop\\test2.txt");

	PrintWriter pw = new PrintWriter(out);

			
	for(int i =0 ; i<5 ; i++){
		pw.println(i+":Line");
	}
	//close Streams
	pw.close();
	out.close();
	System.out.println("C:\\Users\\Rays-2\\Desktop\\test2.txt");
}
}
