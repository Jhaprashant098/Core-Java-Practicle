package Core.IoStream;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
public static void main(String[] args) throws IOException {

	FileWriter out =new FileWriter("C:\\Users\\Rays-2\\Desktop\\test2.txt");
	out.write('A');
	out.write('N');
	out.write("this is line one");
	out.write("this is line two");
	out.close();
	System.out.println("C:\\Users\\Rays-2\\Desktop\\test2.txt");
}
}
