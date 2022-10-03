package Core.IoStream;

import java.io.File;

public class ReadAttributes {
	
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Rays-2\\Desktop\\test2.txt");
		
		if(f.exists());{
			System.out.println("Name:" + f.getName());
			System.out.println("path:"+ f.getPath());
			System.out.println("Total Space:"+ f.getTotalSpace());
			System.out.println("Usable Space:"+ f.getUsableSpace());
			System.out.println("Parent Name:"+ f.getParent());
			System.out.println("Size:"+f.length());
			System.out.println("is readable:"+ f.canRead());
		}
	}

}
