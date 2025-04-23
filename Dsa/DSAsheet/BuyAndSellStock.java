
public class BuyAndSellStock {
public static int maxprofit(int profits[]){ 
    int buyprices = Integer.MAX_VALUE;
    int maxprofit = 0 ;

    for(int i=0;i<profits.length;i++){
        if(buyprices<profits[i]){
            int profit = profits[i] - buyprices;
            maxprofit = Math.max(maxprofit,profit);
        }else{
            buyprices = profits[i];
        }
    }
    return maxprofit;
}
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxprofit(prices));
    }
}
