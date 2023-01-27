package MotorBike;

public class MotorBikeRunner {

	public static void main(String[] args) {

		Mtrbke ducati = new Mtrbke();
		Mtrbke honda = new Mtrbke();

		/* START THE BIKE */
		ducati.start();
		honda.start();

		/* SET INITIAL SPEED */
		ducati.setSpeed(100);
		honda.setSpeed(100);

		/* INCREASE THE SPEED */

		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);

		/* DECREASE THE SPEED */

		ducati.decreaseSpeed(50);
		honda.decreaseSpeed(50);

	}
}
