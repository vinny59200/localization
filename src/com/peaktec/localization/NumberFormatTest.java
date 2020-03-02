package com.peaktec.localization;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) throws ParseException {
		Locale en = new Locale("en", "US");
		Locale da = new Locale("da", "DK");

		NumberFormat fmt = NumberFormat.getInstance(da);
		out(fmt.format(100.76));
		// 100,76
		fmt = NumberFormat.getInstance(en);
		out(fmt.format(100.76));
		// 100.76

		// CURRENCIES
		fmt = NumberFormat.getCurrencyInstance(da);
		out(fmt.format(100.76));
		// kr 100,76
		fmt = NumberFormat.getCurrencyInstance(en);
		out(fmt.format(100.76));
		// $100.76

		// PERCENTAGE
		fmt = NumberFormat.getPercentInstance(en);
		out(fmt.format(0.76));
		// 76%

		// DIGIT
		fmt = NumberFormat.getInstance(en);
		fmt.setMinimumIntegerDigits(2);
		fmt.setMaximumIntegerDigits(3);
		fmt.setMinimumFractionDigits(2);
		fmt.setMaximumFractionDigits(3);
		out(fmt.format(12234.763443));
		// 234.763

		// ROUNDING
		fmt = NumberFormat.getInstance(en);
		fmt.setMinimumFractionDigits(0);
		fmt.setMaximumFractionDigits(0);
		out(fmt.format(99.50));
		// 100
		fmt.setRoundingMode(RoundingMode.HALF_DOWN);
		out(fmt.format(99.50));
		// 99

		// PARSING
		fmt = NumberFormat.getInstance(da);
		out(fmt.parse("100,76"));
		// 100,76
		fmt = NumberFormat.getInstance(en);
		out(fmt.parse("100,76"));
		// 10076

	}

	static void out(Object str) {
		System.out.println(str);
	}
}
