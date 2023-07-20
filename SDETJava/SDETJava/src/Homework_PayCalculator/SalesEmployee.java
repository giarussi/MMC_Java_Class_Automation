package Homework_PayCalculator;

public class SalesEmployee extends Employee {
	private int[] bonusCeilings = { 15, 25, 40 };
	private double[] bonuses = { 250.0, 750.0, 1750.0 };

	public SalesEmployee() {
		super("sales");
	}

	public double calculateSalary(double... args) {
		int sales = (int) args[0];
		double basePay = 750.0;
		double bonus = 0.0;

		if (sales > bonusCeilings[2]) {
			bonus = bonuses[2];
			System.out.println("Congratulations! You have exceeded the highest bonus level.");
		} else if (sales > bonusCeilings[1]) {
			bonus = bonuses[1];
			System.out.println("Congratulations! You have exceeded the second bonus level.");
		} else if (sales > bonusCeilings[0]) {
			bonus = bonuses[0];
			System.out.println("Congratulations! You have exceeded the first bonus level.");
		} else {
			int difference = bonusCeilings[0] - sales;
			System.out
					.println("Sorry, you couldn't complete your sales quota. You missed your target by " + difference);
		}

		return basePay + bonus;
	}

}
