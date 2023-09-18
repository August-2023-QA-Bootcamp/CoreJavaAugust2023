package lec10_02_java_date_and_time;

import java.time.LocalDate;
import java.time.LocalTime;

public class B_displayCurrentTime {
	public static void main(String[] args) {
		// Local Date
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		// Local Time
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
	}
}
