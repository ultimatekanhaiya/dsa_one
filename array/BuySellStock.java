public class BuySellStock {

    public static void main(String[] args) {
        System.out.println(buySellStock(new int[] { 7, 1, 5, 3, 6, 4 }));
    }

    public static int buySellStock(int[] arr) {

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {

            if (buyPrice < arr[i]) { // profit
                int profit = arr[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }
}