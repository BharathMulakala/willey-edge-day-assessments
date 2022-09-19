package com.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		Calendar calendar = Calendar.getInstance();
//		System.out.println(calendar);
//		System.out.println(calendar.get(calendar.DAY_OF_WEEK));
//		System.out.println(calendar.get(calendar.DAY_OF_YEAR));
//		System.out.println(calendar.get(calendar.YEAR));
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getYear());
		System.out.println(today.getYear());
		LocalDateTime  datetime = LocalDateTime.now();
		System.out.println(datetime);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyy");
		System.out.println(formatter);
		

	}

}
