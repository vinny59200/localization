package com.peaktec.localization;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatTest {
	public static void main(String[] args) throws ParseException {

		// INTRO
		String ptn = "dd-MM-yyyy";
		SimpleDateFormat fmt = new SimpleDateFormat(ptn);
		// Mon Mar 02 06:27:27 CET 2020
		Date d = new Date();
		out(d);
		out(fmt.format(d));
		// 02-03-2020
		String dateText = "29-11-2017";
		d = fmt.parse(dateText);
		out(fmt.format(d));
		// 29-11-2017

		// LOCALE
		Locale locale = new Locale("da", "DK");
		ptn = "EEEEE MMMMM yyyy";
		fmt = new SimpleDateFormat(ptn);
		// Mon Mar 02 06:27:27 CET 2020
		d = new Date();
		out(d);
		out(fmt.format(d));
		// Monday March 2020
		fmt = new SimpleDateFormat(ptn, locale);
		out(fmt.format(d));
		// mandag marts 2020

		// PATTERN
		ptn = "dd-MM-yy";
		fmt = new SimpleDateFormat(ptn);
		d = new Date();
		out(fmt.format(d));
		// 02-03-20
		ptn = "MM-dd-yyyy";
		fmt = new SimpleDateFormat(ptn);
		out(fmt.format(d));
		// 03-02-2020
		ptn = "yyyy-MM-dd HH:mm:ss";
		fmt = new SimpleDateFormat(ptn);
		out(fmt.format(d));
		// 2020-03-02 06:27:27
		ptn = "EEEEE MMMMM yyyy HH:mm:ss.SSSZ";
		fmt = new SimpleDateFormat(ptn);
		out(fmt.format(d));
		// Monday March 2020 06:27:27.765+0100
	}

	static void out(Object str) {
		System.out.println(str);
	}
}
