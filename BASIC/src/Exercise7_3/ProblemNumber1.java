package Exercise7_3;

import java.time.LocalDate;
import java.time.Period;

public class ProblemNumber1 {
public static void main(String[]args) {
	LocalDate l = LocalDate.of(2000, 12, 24);
	LocalDate n = LocalDate.now();
	Period p = Period.between(l, n);
	System.out.println(p);
	
	System.out.println("Year : "+p.getYears());
	System.out.println("Months : "+p.getMonths());
	System.out.println("Days : "+p.getDays());
}
}
