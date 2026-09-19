import java.util.*;
public class leet1475 {
    public static int[] finalPrices(int[] prices){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < prices.length; i++){
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                int index = stack.pop();
                prices[index] = prices[index] - prices[i];
            }
            stack.push(i);
        }
        return prices;
    }
    public static void main(String[] args){
        int[] prices = {8, 4, 6, 2, 3 };
        System.out.println("INPUT : " + Arrays.toString(prices));
        int[] result = finalPrices(prices);
        System.out.println("OUTPUT : " + Arrays.toString(result));
    
    }
}
