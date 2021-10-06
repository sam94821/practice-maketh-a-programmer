package com.practice.date;

import java.time.DayOfWeek;
import java.time.ZonedDateTime;
import java.util.ArrayList;

/**
 * File : OpeningHours.java
 * -----------------------------------------------------------------------------------------------------------------------------
 * Problem Description	:	Amy and Valerie, the shop owners, need you to develop a simple program that satisfies
 * 										 	the following requirements: 
 * 
 * 										 		- The opening days and hours of the shop need to be configurable, and can be scattered 
 * 											 	    in the week (e.g. Mon, Wed, Fri from 08:00 to 16:00)
 * 
 *												- Amy needs to display the date of the next opening on a billboard outside of the shop
 *
 *												- Amy also wants to display on the website of the shop whether it is opened or closed at the moment
 * 
 * Problem Statement 	:	Write a small module that follows this contract, so that Valerie can easily integrate it:
 * 											OpeningHours.isOpenOn(date)
 *											OpeningHours.nextOpeningDate(date)
 *	----------------------------------------------------------------------------------------------------------------------------------------											
 *											
 *
 * @author Sam
 *-------------------------------------------------------------------------------------------------------------------------------------
 */
public class OpeningHours {
	
	private static ZonedDateTime currentObject;
	private static DayOfWeek currentDay;
	
	private static ArrayList<DayOfWeek> openDays = new ArrayList<DayOfWeek>();
	
	protected static boolean isOpenOn(DayOfWeek dowObject) {
	
		setOpenDays(openDays);
		
		if(openDays.contains(dowObject))
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	
	protected static void setOpenDays(ArrayList openDays) {
		/*For later.*/
		OpeningHours.openDays.add(DayOfWeek.MONDAY);
		OpeningHours.openDays.add(DayOfWeek.WEDNESDAY);
		OpeningHours.openDays.add(DayOfWeek.FRIDAY);
		OpeningHours.openDays = new ArrayList<DayOfWeek>(openDays);
	}
}
