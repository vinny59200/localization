package com.peaktec.localization;

import java.util.Locale;

public class LocaleTest{
	   public static void main(String[] args) {
	      Locale l=Locale.getDefault();  

	      //Default Locale Properties:
	      out(l.getDisplayCountry());//United States
	      out(l.getDisplayLanguage());//English
	      out(l.getDisplayName());//English (United States)
	      out(l.getISO3Country());//USA
	      out(l.getISO3Language());//eng
	      out(l.getLanguage());//en
	      out(l.getCountry());//US

	      Locale frL = new Locale("fr","fr");

	      //fr Locale Properties:
	      out(frL.getDisplayCountry());//France
	      out(frL.getDisplayLanguage());//French
	      out(frL.getDisplayName());//French (France)
	      out(frL.getISO3Country());//FRA
	      out(frL.getISO3Language());//fra
	      out(frL.getLanguage());//fr
	      out(frL.getCountry());//FR
	      
	      
	      Locale defaultLocale = Locale.getDefault();
	      out(defaultLocale.getDisplayLanguage());

	      Locale frLocale = new Locale("fr", "FR");  
	      out(defaultLocale.getDisplayLanguage(frLocale));
	   }

	   static void out(String s) {
	    System.out.println(s);
	   }
	}