package com.sahil.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CurrentTimeClass {

	public static void main(String[] args) {
		long l = getDifference();
		System.out.println(l);
		/*System.out.println(l/3600+":"+(l%3600)/60+":"+(l%3600)%60);*/
		
		System.out.println();
		/*catch(ParseException e){
			e.printStackTrace();
		}*/

	}
	public static long getDifference()
	{
	    SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy");
	    
	    Date d;
	    Date d1;
		try {
			d = sdf.parse("Tue Nov 28 00:00:00 IST 2017");
			d1= sdf.parse("Tue Nov 28 00:00:03 IST 2017");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			d = new Date();
			d1= new Date();
			}

	    Calendar c = Calendar.getInstance();
	    c.setTime(d);
	    Calendar c2 = Calendar.getInstance();
	    c2.setTime(d1);
	    long curr = c2.getTimeInMillis();
	    long time = c.getTimeInMillis();
	    /*long curr = System.currentTimeMillis();*/
	    long diff = curr - time;    //Time difference in milliseconds
	    return diff/1000;
	}

}
