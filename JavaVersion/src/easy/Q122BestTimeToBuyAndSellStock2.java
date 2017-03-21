package easy;

/**
 * Created by shhuang on 2017/3/21.
 */
public class Q122BestTimeToBuyAndSellStock2 {
    public static void main(String[] args){
        int[] g={1,2,3};
        Q122BestTimeToBuyAndSellStock2 object =new Q122BestTimeToBuyAndSellStock2();
        System.out.println(object.maxProfit(g));

    }

    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0) return 0;
        int result=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]) result+=(prices[i+1]-prices[i]);
        }
        return result;
    }
}
