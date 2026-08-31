import java . util.*;
public class leet121 { 
    public static int profit(int[] nums){
        int temp = 0 , high = 0;
        for(int i = nums.length - 1 ; i >= 0; i--){
           for(int j = i - 1 ; j >= 0; j--)
            if(nums[i] > nums[j]){
                temp = nums[i] - nums[j];
                if(temp > high){
                    high = temp;
                }
            }
        }
        return high;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int res = profit(nums);
        System.out.println("profit = " + res);
        sc.close();
    }
}
