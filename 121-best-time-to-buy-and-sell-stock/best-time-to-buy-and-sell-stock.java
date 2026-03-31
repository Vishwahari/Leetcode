class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for(int price:prices){
            if(price<minPrice){
                minPrice = price;
            }
            int profit = price - minPrice;
            if(profit>maxPrice){
                maxPrice = profit;
            }
        }
        return maxPrice;
    }
}