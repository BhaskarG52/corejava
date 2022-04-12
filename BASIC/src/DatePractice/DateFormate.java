package DatePractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormate {
public static void main(String[]args) throws ParseException {
	Date d = new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	String s = sdf.format(d);
	System.out.println(s);
	
	
	String da = "22/03/1998";
	d = sdf.parse(da);
	System.out.println(d);
	
	
	
}
}
