import java . util.*;
public class Leader {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();    
        }
        for(int i = 0; i < n-1; i++){
            boolean flag = true;
            for(int j = i ;j < n ; j++ ){
                if(arr[i] <  arr[j]){
                    flag = false;
                }
                
            }
            if(flag){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print(arr[n-1] + " ");
        sc.close();
    }
}
