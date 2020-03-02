package com.peaktec.localization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
	public static void main(String[] args) {

		// DATE
		Locale loc = new Locale("da", "DK");
		DateFormat fmt = DateFormat.getDateInstance();
		out(fmt.format(new Date()));
		// Mar 2, 2020
		fmt = DateFormat.getDateInstance(DateFormat.DEFAULT, loc);
		out(fmt.format(new Date()));
		// 2. mar. 2020

		// PATTERNS
		fmt = DateFormat.getDateInstance(DateFormat.DEFAULT);
		out(fmt.format(new Date()));
		// Mar 2, 2020
		fmt = DateFormat.getDateInstance(DateFormat.SHORT);
		out(fmt.format(new Date()));
		// 3/2/20
		fmt = DateFormat.getDateInstance(DateFormat.MEDIUM);
		out(fmt.format(new Date()));
		// Mar 2, 2020
		fmt = DateFormat.getDateInstance(DateFormat.LONG);
		out(fmt.format(new Date()));
		// March 2, 2020
		fmt = DateFormat.getDateInstance(DateFormat.FULL);
		out(fmt.format(new Date()));
		// Monday, March 2, 2020

		// TIME
		fmt = DateFormat.getTimeInstance(DateFormat.DEFAULT);
		out(fmt.format(new Date()));
		// 4:12:49 AM
		fmt = DateFormat.getTimeInstance(DateFormat.SHORT);
		out(fmt.format(new Date()));
		// 4:12 AM
		fmt = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		out(fmt.format(new Date()));
		// 4:12:49 AM
		fmt = DateFormat.getTimeInstance(DateFormat.LONG);
		out(fmt.format(new Date()));
		// 4:12:49 AM CET
		fmt = DateFormat.getTimeInstance(DateFormat.FULL);
		out(fmt.format(new Date()));
		// 4:12:49 AM Central European Standard Time

		// DATE & TIME
		fmt = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT);
		out(fmt.format(new Date()));
		// Mar 2, 2020, 4:14:57 AM
		fmt = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		out(fmt.format(new Date()));
		// 3/2/20, 4:14 AM
		fmt = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
		out(fmt.format(new Date()));
		// Mar 2, 2020, 4:14:57 AM
		fmt = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		out(fmt.format(new Date()));
		// March 2, 2020 at 4:14:57 AM CET
		fmt = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		out(fmt.format(new Date()));
		// Monday, March 2, 2020 at 4:14:57 AM Central European Standard Time
		
		
	}

	static void out(Object str) {
		System.out.println(str);
	}
}
