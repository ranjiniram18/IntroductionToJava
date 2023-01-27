package MotorBike;

public class BookRunner {
	public static void main(String[] args) {
		Book artofpgm = new Book();
		Book effectivecoding = new Book();
		Book codeclean = new Book();

		artofpgm.read(29);
		effectivecoding.read(33);
		codeclean.read(10);

		/* increase the number of copies */
		artofpgm.increaseNoOfCopy(20);
		effectivecoding.increaseNoOfCopy(10);
		codeclean.increaseNoOfCopy(5);

		/* decrease the number of copies */
		artofpgm.decreaseNoOfCopy(10);
		effectivecoding.decreaseNoOfCopy(5);
		codeclean.decreaseNoOfCopy(16);

	}

}
