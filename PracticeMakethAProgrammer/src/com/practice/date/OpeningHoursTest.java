package com.practice.date;

import static org.junit.jupiter.api.Assertions.*;

import java.time.DayOfWeek;

import org.junit.jupiter.api.Test;

class OpeningHoursTest {

	@Test
	void testIsOpenOn() {
		
		assertEquals(true,OpeningHours.isOpenOn(DayOfWeek.WEDNESDAY));
	}
	@Test
	void testIsNotOpenOn() {
		
		assertEquals(false,OpeningHours.isOpenOn(DayOfWeek.TUESDAY));
	}

}
