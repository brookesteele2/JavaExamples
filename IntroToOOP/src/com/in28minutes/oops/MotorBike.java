package com.in28minutes.oops;

public class MotorBike {
	// state
	private int speed;

	// behavior
	// method(what should be inputs, outputs, and name)
//input int speed
//outputs void
//name setSpeed

	int getSpeed() {
		return this.speed;
	}


	public void setSpeed(int speed) {// local variable
		if(speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	void start() {
		System.out.println("Bike Started");
	}
}
