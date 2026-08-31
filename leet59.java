import java . util.*;
public class leet59 { 
    public static int[][] profit(int[] nums){
        int[][] mat = new int[n][n]; 
        int top = 0 , left = 0 , bottom = n - 1 , right = n - 1 , num = 1;
        while(top <= bottom && left <= right){
            for(int i = left; i<= right; i++){
                mat[top][i] = num++;
            } top++;
             for(int i = top; i<= bottom; i++){
                mat[i][right] = num++;
            } right--;
             if (top <= bottom){
                for(int i = right; i >= left ; i--){
                    mat[bottom][i] = num++;
                }bottom--;

             }
             if(left <= right){
                for(int i = bottom; i >= top; i--){
                    mat[i][left] = num++;
                }left++;
             }
        }
        return mat;
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