package Core.IoStream;

import java.io.FileReader;
import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) throws Exception{
		
		FileReader f =  new FileReader("C://Users//Rays-2//Desktoptest2.txt");
		
		Scanner sc = new Scanner(f);
		
		while(sc.hasNext());{
		System.out.println(sc.nextLine());
	}
	f.close();
	}
}
