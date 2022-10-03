package Prashant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		{
			String dd = "05/10/2019";
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

			Date d1 = sdf.parse(dd);
			System.out.println(d1);
		}
	}
}