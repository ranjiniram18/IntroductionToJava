package MotorBike;

public class Book {
	private int noOfCopy;

	void read(int noOfCopy) {
		if (noOfCopy > 0)
			this.noOfCopy = noOfCopy;

		// System.out.println("the number of copies of book is" + noOfCopy);
	}

	public void increaseNoOfCopy(int numberOfCopy) {
		read(noOfCopy + numberOfCopy);
		System.out.println(noOfCopy);
	}

	public void decreaseNoOfCopy(int numberOfCopy) {
		read(noOfCopy - numberOfCopy);
		System.out.println(noOfCopy);
	}
}
