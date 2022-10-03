package Core.IoStream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestKeyboard {

	public static void main(String[] args) throws IOException {

		InputStreamReader kb = new InputStreamReader(System.in);
		
		BufferedReader in = new BufferedReader(kb);
          
		PrintWriter out = new PrintWriter(new FileWriter("c://temp1.txt"));
		
		System.out.println("type text at console , type 'quite to exit");
		
		String line = in.readLine();
		
		while (!line.equals("quite")){
			out.println(line);
			
			line = in.readLine();
		}
		out.close();
		kb.close();
		
	}

}
