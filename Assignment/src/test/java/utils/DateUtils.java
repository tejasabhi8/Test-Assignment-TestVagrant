package utils;

import java.util.HashMap;

public class DateUtils {
	
	public static String formatDateWiki(String date_string) {
		//Extracted Format = 17 December 2021
		
		String Wsplit[] = split_string(date_string);//split based on delimiter
		int day = Integer.parseInt(Wsplit[0]);
		int month = getMonth(Wsplit[1]);
		int year = Integer.parseInt(Wsplit[2]);
		
		String datewiki = day+"-"+month+"-"+year;//return date in the format dd-mm--yyy
		return datewiki;
	}
	
	public static String formatDateImdb(String date_string) {
		//Extracted Format = December 17, 2021 (United States)
		
		String after_removing_braces;
		int startIndex = 0;
	    int endIndex = date_string.indexOf('(');
	    after_removing_braces = date_string.substring(startIndex, endIndex-1); //-1 to remove the last space after removing (
	    
		String Isplit[] = split_string(after_removing_braces);//split based on delimiter
		int day = Integer.parseInt(Isplit[1]);
		int month = getMonth(Isplit[0]);
		int year = Integer.parseInt(Isplit[2]);
		String dateimdb = day+"-"+month+"-"+year;//return date in the format dd-mm--yyy
		return dateimdb;
		
	}
	
	public static String[] split_string(String original_string) {
		
		String[] stringarray = original_string.split("[, . ']+");  
		return stringarray;
	}
	
	public static int getMonth(String month) {
		HashMap<String, Integer> months = new HashMap<String, Integer>();
		months.put("January", 1);
		months.put("February", 2);
		months.put("March", 3);
		months.put("April", 4);
		months.put("May", 5);
		months.put("June", 6);
		months.put("Jul", 7);
		months.put("August", 8);
		months.put("September", 9);
		months.put("October", 10);
		months.put("November", 11);
		months.put("December", 12);
		
		
		return months.get(month);
		
	}

}
