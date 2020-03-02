package com.peaktec.localization;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormatTest {
	static String pattern = "";
	static DecimalFormat fmt = new DecimalFormat(pattern);

	static void out(Object str) {
		System.out.println(str);
	}

	static void set(DecimalFormat fmt, String pattern) {
		DecimalFormatTest.fmt = new DecimalFormat(pattern);
		DecimalFormatTest.fmt.applyPattern(pattern);
	}

	static void set2(DecimalFormat fmt, String pattern) {
		DecimalFormatTest.fmt = fmt;
		DecimalFormatTest.fmt.applyPattern(pattern);
	}

	public static void main(String[] args) {
		out("INTRO");
		set(fmt, "####,####.##");
		double nb = 123456789.123;
		out(nb);// 1.23456789123E8
		out(fmt.format(nb));// 1,2345,6789.12

		out("PATTERN");
		// pattern ###.###
		set(fmt, "###.###");
		out(fmt.format(nb));// 123456789.123
		// pattern ###.#
		set(fmt, "###.#");
		out(fmt.format(nb));// 123456789.1
		// pattern ###,###.##
		set(fmt, "###,###.##");
		out(fmt.format(nb));// 123,456,789.12
		// pattern 000.###
		nb = 9.34;
		set(fmt, "000.###");
		out(fmt.format(nb));// 009.34

		out("LOCALE");
		set(fmt, "###.##");
		nb = 123.45;
		Locale en = new Locale("en", "US");
		Locale da = new Locale("da", "DK");
		fmt = (DecimalFormat) NumberFormat.getNumberInstance(en);
		set2(fmt, "###.##");
		out(fmt.format(nb));// 123.45
		fmt = (DecimalFormat) NumberFormat.getNumberInstance(da);
		set2(fmt, "###.##");
		out(fmt.format(nb));// 123,45

		out("SEPARATOR");
		set(fmt, "#,###.###");
		nb = 126473.4567;
		out(fmt.format(nb));// 126,473.457
		DecimalFormatSymbols sep = new DecimalFormatSymbols();
		sep.setDecimalSeparator(';');
		sep.setGroupingSeparator(':');
		fmt = new DecimalFormat(pattern, sep);
		out(fmt.format(nb));// 126:473;457

		out("GROUPING");
		set(fmt, "");
		fmt.setGroupingSize(2);
		out(fmt.format(nb));

	}

}
