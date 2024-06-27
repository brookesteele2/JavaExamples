package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();
		
		ducati.setSpeed(100);
		honda.setSpeed(0);

		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);

		ducati.decreaseSpeed(300);
		ducati.decreaseSpeed(50);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());


	}

}
