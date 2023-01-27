package MotorBike;

public class Mtrbke {

	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println(speed);
	}

	public void increaseSpeed(int howMuch) {
		this.speed = speed + howMuch;
		System.out.println(speed);
	}

	public void decreaseSpeed(int howMuch) {
		this.speed = speed - howMuch;
		System.out.println(speed);
	}

	void start() {

		System.out.println("bike started");

	}

}
