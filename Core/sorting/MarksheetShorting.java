package Core.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class MarksheetShorting {
	public static void main(String[] args) {

		Marksheet m1 = new Marksheet();
		m1.setRollNo("1");
		m1.setFname("ram");
		m1.setLname("sharma");
		m1.setPhy(77);
		m1.setChe(67);
		m1.setMat(87);

		Marksheet m2 = new Marksheet();
		m2.setRollNo("2");
		m2.setFname("vishal");
		m2.setLname("choudhary");
		m2.setPhy(85);
		m2.setChe(45);
		m2.setMat(90);

		Marksheet m3 = new Marksheet();
		m3.setRollNo("4");
		m3.setFname("manoj");
		m3.setLname("varma");
		m3.setPhy(67);
		m3.setChe(80);
		m3.setMat(54);

		Marksheet m4 = new Marksheet();
		m4.setRollNo("3");
		m4.setFname("abhishek");
		m4.setLname("gupta");
		m4.setPhy(48);
		m4.setChe(96);
		m4.setMat(76);

		Marksheet m5 = new Marksheet();
		m5.setRollNo("5");
		m5.setFname("abhishek");
		m5.setLname("gupta");
		m5.setPhy(48);
		m5.setChe(96);
		m5.setMat(76);

		ArrayList list = new ArrayList();
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
        list.add(m5);
        
       Collections.sort(list);
       
       Iterator it = list.iterator();
       while(it.hasNext()){
    	   
   Object o = it.next();
   
   System.out.println(o);
   

	}
  }
}