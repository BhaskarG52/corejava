package Exercise7_3;

import java.util.Calendar;
import java.util.Date;

public class ProblemNumber2 {
	public static void main(String[] args) {
		// Date today = new Date();
		Calendar cal = Calendar.getInstance();
		for (int i = 1; i <= 12; i++) {
			cal.add(Calendar.DATE, 30);
			Date nextEvent = cal.getTime();
			System.out.println(nextEvent);

		}

	}
}




