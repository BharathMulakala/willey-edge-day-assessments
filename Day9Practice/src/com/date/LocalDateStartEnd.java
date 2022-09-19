package com.date;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateStartEnd {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2018, 8, 17);
		LocalDate end = LocalDate.of(2021, 12, 7);
		Period diff= Period.between(start, end);
		System.out.println(diff);
		System.out.println(diff.getDays());
		System.out.println(diff.getMonths());
		System.out.println(diff.getYears());
	}

}
