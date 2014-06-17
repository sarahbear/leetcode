package level2;

import java.util.Arrays;

public class Best_Time_to_Buy_and_Sell_Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProfit(int[] prices) {
		if (prices.length == 0)
			return 0;
		int maxProfit = 0;
		int minPrice = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > minPrice)
				maxProfit = Math.max(maxProfit, prices[i] - minPrice);
			else
				minPrice = prices[i];
		}
		return maxProfit;
	}
}
