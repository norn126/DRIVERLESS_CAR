package com.lucas.fancycar.driverless;

import org.junit.Test;

import com.lucas.fancycar.driverless.exceptions.BreakingDrivingRuleException;

public class BenzTest {
	Car benz = new Benz(1,1,"north");
	@Test
	public void goForASpin()  {
		benz.reportPosition();

		try {
			benz.move("east"); benz.reportPosition();
			benz.move("south");benz.reportPosition();
			benz.move("south");benz.reportPosition();
			benz.move("nowhere");benz.reportPosition();
			
		} catch (BreakingDrivingRuleException e) {
			System.out.println("U have broken the driving rule, never do this again!");
		} catch (Exception e){
			System.out.println("What on earth...");
		}
	}
}
