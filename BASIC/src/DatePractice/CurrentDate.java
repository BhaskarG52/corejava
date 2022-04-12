package DatePractice;

import java.util.Date;

public class CurrentDate {
public static void main(String[]args) {
	Date d = new Date();
	System.out.println("DAte : "+d);
	
	System.out.println("Long Time : "+d.getTime());
}
}
    //time will be in milli sec....