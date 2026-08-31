import java.util.HashSet;
import java.util.Scanner;

public class leet409 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //String s = "abccccdd";
        HashSet <Character> set = new HashSet<>();
        int length = 0;
        for(char ch : s.toCharArray()){
        if(set.contains(ch)){
           set.remove(ch);
           length = length + 2;
        }
        else{
           set.add(ch);
        }
        }
        if(!set.isEmpty()){
           length++;
        } 

        System.out.println(length);
            
    }
        
}
     /* int[] arr = new int[128];
        for(int i : s.toCharArray()){
            arr[i]++;
        }
        int length = 0;
        boolean odd = false;
        for(int count : arr){
            if(count % 2 == 0){ 
                length = length + count;
            }
            else{
                length = length + count-1; 
                odd = true;
            }
        }
        if(odd){
            length++;
        } */





