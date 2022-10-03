package Core.IoStream;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
	public static void main(String[] args) throws IOException {
		try ( FileReader in = new FileReader("C:\\Users\\Rays-2\\Desktop\\test.txt");){
			int ch = in.read();
			char chr;
			
			while(ch != -1){
				chr = (char) ch;
				System.out.println(chr);
				ch = in.read();
			}
			in.close();
		}
	}
	}
