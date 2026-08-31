import java . util.*;
public class leet45 { 
    public static int jump(int[] nums){
        int jumps = 0 , currentend = 0 , farthest = 0;
        for(int i = 0 ; i < nums.length - 1; i++){
            farthest = Math.max(farthest, i + nums[i]);
            if(i == currentend){
                jumps++;
                currentend = farthest;
            }
        }
        return jumps;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements :");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int res = jump(nums);
        System.out.println("minimum jumps = " + res);
        sc.close();
    }
}
