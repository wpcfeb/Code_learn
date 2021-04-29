package Calculation;

public class Fee {
	public static void main(String[] args) {
		Fee sol = new Fee();
		sol.sharedStuff = 0;

		sol.P1Name = "Qinzheng";
		sol.p1PersonalStuff = 9.45 + 8.95;

		sol.P2Name = "Pengce";
		sol.p2PersonalStuff = 9.45 + 8.95;

		sol.P3Name = "Hongjiang";
		sol.p3PersonalStuff = 8.95;

		String paidName = "Pengce";
		double receipt = 50.1;


		sol.P1SumProduct = sol.sharedStuff / 3 + sol.p1PersonalStuff;
		sol.P2SumProduct = sol.sharedStuff / 3 + sol.p2PersonalStuff;
		sol.P3SumProduct = sol.sharedStuff / 3 + sol.p3PersonalStuff;
		sol.Calculation(sol.P1Name, sol.P2Name, sol.P3Name, sol.P1SumProduct, sol.P2SumProduct, sol.P3SumProduct,
				receipt, paidName, sol.sharedStuff / 3, sol.p1PersonalStuff, sol.p2PersonalStuff,
				sol.p3PersonalStuff);
	}

	// name of each person
	String P1Name;
	String P2Name;
	String P3Name;

	// product cost of each person
	double sharedStuff;
	double p1PersonalStuff;
	double p2PersonalStuff;
	double p3PersonalStuff;
	double P1SumProduct;
	double P2SumProduct;
	double P3SumProduct;

	private void Calculation(String P1Name, String P2Name, String P3Name, double p1SumProduct, double p2SumProduct,
			double p3SumProduct, double total, String paidName, double sharedProduct, double p1PersonalProduct,
			double p2PersonalProduct, double p3PersonalProduct) {
		double sumProduct = p1SumProduct + p2SumProduct + p3SumProduct;
		double P1Cost = total * p1SumProduct / sumProduct;
		double P2Cost = total * p2SumProduct / sumProduct;
		double P3Cost = total * p3SumProduct / sumProduct;
		double P1Tax = P1Cost - p1PersonalProduct - sharedProduct;
		double P2Tax = P2Cost - p2PersonalProduct - sharedProduct;
		double P3Tax = P3Cost - p3PersonalProduct - sharedProduct;

		// #.##
		String sharedStuff = String.format("%.2f", sharedProduct);
		String p1 = String.format("%.2f", p1PersonalProduct);
		String p2 = String.format("%.2f", p2PersonalProduct);
		String p3 = String.format("%.2f", p3PersonalProduct);
		String s1 = String.format("%.2f", P1Cost);
		String s2 = String.format("%.2f", P2Cost);
		String s3 = String.format("%.2f", P3Cost);
		String T1 = String.format("%.2f", P1Tax);
		String T2 = String.format("%.2f", P2Tax);
		String T3 = String.format("%.2f", P3Tax);

		if (!P1Name.equals(paidName)) {
			System.out.println("" + P1Name + " should transfer to " + paidName + ": " + s1);
			System.out.println("# Details	Shared stuff:" + sharedStuff + " Personal stuff:" + p1 + " tax:" + T1 + " #");
		} else {
			System.out.println("" + paidName + ": " + s1);
			System.out.println("# Details	Shared stuff:" + sharedStuff + " Personal stuff:" + p1 + " tax:" + T1 + " #");
			
		}

		System.out.println();

		if (!P2Name.equals(paidName)) {
			System.out.println("" + P2Name + " should transfer to " + paidName + ": " + s2);
			System.out.println("# Details	Shared stuff:" + sharedStuff + " Personal stuff:" + p2 + " tax:" + T2 + " #");
		} else {
			System.out.println("" + paidName + ": " + s2);
			System.out.println("# Details	Shared stuff:" + sharedStuff + " Personal stuff:" + p2 + " tax:" + T2 + " #");
			
		}

		System.out.println();

		if (!P3Name.equals(paidName)) {
			System.out.println("" + P3Name + " should transfer to " + paidName + ": " + s3);
			System.out.println("# Details	Shared stuff:" + sharedStuff + " Personal stuff:" + p3 + " tax:" + T3 + " #");
			;
		} else {
			System.out.println("" + paidName + ": " + s3);
			System.out.println("# Details	Shared stuff:" + sharedStuff + " Personal stuff:" + p3 + " tax:" + T3 + " #");
			
		}

		System.out.println();
	}

}
