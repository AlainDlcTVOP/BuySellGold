package buySellGold;



public class Main {

	int[] pricelist;
	int buyDay;
	int sellDay;
	int maximumProfit;
	boolean isProfit;

	public static void main(String[] args) {
		new Main().Skills();
	}

	public void Skills() {
//		pricelist = new int[] { 2, 7, 1, 8, 2, 8, 4, 5, 9, 0, 4, 5 }; // normal vector //solution 1 is 2 and 8
//		
//		pricelist = new int[]{9,8,7,6,5,4,3,2,1}; // less loss // solutions1 is 0 and 1
//	    
//		pricelist = new int[]{9,1,8,7,6,5,4,3,2}; // less loss // solution1 is 1 and 2
//	    
		pricelist = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 5, 0, 0 }; // best profit // solution1 is 0 and 8

//		pricelist = new int[] { 1, 9, 2, 3, 4, 5, 6, 7, 8 }; // best profit// solution1 is 0 and 1

		SolutionAlain();

		// System.out.println("Buy day is : " + getBuyDay() +
		// " and sell day is : " + getSellDay());

	}


	public void SolutionAlain() {
		buyDay = sellDay = 0;
		maximumProfit = 0;
		isProfit = false;

		for (int i = 0; i < pricelist.length - 1; i++)
			for (int j = i + 1; j < pricelist.length; j++)
				if (pricelist[j] - pricelist[i] > maximumProfit) {
					maximumProfit = pricelist[j] - pricelist[i];
					buyDay = i;
					sellDay = j;
					isProfit |= true;
				}

		if (!isProfit) {
			maximumProfit = 0;
			buyDay = 0; sellDay = 1;

			for (int i = 0; i < pricelist.length - 1; i++)
				for (int j = i + 1; j < pricelist.length; j++)
					if (pricelist[j] - pricelist[i] > maximumProfit) {
						maximumProfit = pricelist[j] - pricelist[i];
						buyDay = i;
						sellDay = j;
					}

		}

	}

	public int getBuyDay() {

		return buyDay;
	}

	public int getSellDay() {

		return sellDay;
	}


}
