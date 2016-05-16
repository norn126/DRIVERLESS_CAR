package com.lucas.fancycar.driverless;

import com.lucas.fancycar.driverless.exceptions.BreakingDrivingRuleException;

public class Benz implements Car {

	private int positionX;
	private int positionY;
	private String orientation;

	public Benz(int positionX, int positionY, String orientation) {
		this.positionX = positionX;
		this.positionY = positionY;
		this.orientation = orientation;
	}
	
	public void reportPosition() {
		System.out.println("My current position is " + 
				"positionX=" + getPositionX() + ", positionY=" + getPositionY()
				+ ", orientation=" + getOrientation()); 
	}



	public void move(String command) throws BreakingDrivingRuleException {
		switch(command){
		// heading east
		case("east"):
			this.orientation = "east";
			positionX ++;break;

			//heading west
		case("west"): 
			if(positionX > 0) {
				this.orientation = "west";
				positionX --;}
		//hitting boundary
			else throw new BreakingDrivingRuleException();
		break;

		//heading north
		case("north"): 
			this.orientation = "north";
			positionY ++; break;

		//heading south
		case("south"): 
			if(positionY > 0) {
				this.orientation = "south";
				positionY --;}
		//hitting boundary
			else throw new BreakingDrivingRuleException();
		break;

		default: System.out.println("Command not found ^^");
		break;
		}
	}

	private int getPositionX() {
		return positionX;
	}

	private int getPositionY() {
		return positionY;
	}

	private String getOrientation() {

		return orientation;
	}

}
