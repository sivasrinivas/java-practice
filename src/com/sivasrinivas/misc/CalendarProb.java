package com.sivasrinivas.misc;

import java.io.*;

public class CalendarProb {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CalendarProb cal = new CalendarProb();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first Date:");
		String firstDate = br.readLine();
		System.out.println("Day of the date:");
		String day = br.readLine();
		System.out.println("Enter second Date:");
		String secondDate = br.readLine();
		System.out.println(cal.findDayOfDate(firstDate,day,secondDate));
		
		
		
	}

	public String findDayOfDate(String firstDate, String day1, String secondDate) {
		// TODO Auto-generated method stub
		
		
		int d1=Integer.parseInt(firstDate.substring(0, 2));
		int m1=Integer.parseInt(firstDate.substring(3, 5));
		int y1=Integer.parseInt(firstDate.substring(6, 8));
		int doy1 = d1+m1*30;
		
		int d2=Integer.parseInt(secondDate.substring(0, 2));
		int m2=Integer.parseInt(secondDate.substring(3, 5));
		int y2=Integer.parseInt(secondDate.substring(6, 8));
		int doy2 = d2+m2*30+(y2-y1)*360;
		
		String day2 = new String();
		
		int x=0;
		if(day1.equals("sunday"))
			x=0;
		else if(day1.equals("monday"))
			x=1;
		else if(day1.equals("tuesday"))
			x=2;
		else if(day1.equals("wednesday"))
			x=3;
		else if(day1.equals("thursday"))
			x=4;
		else if(day1.equals("friday"))
			x=5;
		else if(day1.equals("saturday"))
			x=6;
		
		doy2=(doy2-doy1+x)%7;
		
		switch(doy2){
		case 0:
			day2 = "sunday";
			break;
		case 1:
			day2 = "monday";
			break;
		case 2:
			day2 = "tuesday";
			break;
		case 3:
			day2 = "wednesday";
			break;
		case 4:
			day2 = "thursday";
			break;
		case 5:
			day2 = "friday";
			break;
		case 6:
			day2 = "saturday";
			break;
		}
		
		return day2;
	}

}
