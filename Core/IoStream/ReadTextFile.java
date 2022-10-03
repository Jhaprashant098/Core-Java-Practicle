package Core.IoStream;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
public static void main (String[] args) throws IOException {
	
	FileReader in = new FileReader("C:\\Users\\Rays-2\\Desktop\\test.txt");
	int ch = in.read(); // read ASCII code
	char chr;
	
	while(ch != -1){ 
		chr = (char)ch;// -1 is end of File
		
		System.out.println(chr);
		
		ch= in.read();
		
	}
	in.close();
  }
}
