
import java.util.*;

public class leet6{
    public static String convert(String s , int numRows) {
        if(numRows == 1 || s.length() <= numRows){
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++){
            rows[i] = new StringBuilder();

        } 
        int cur = 0; boolean going = false;
        for(char c : s.toCharArray()){
            rows[cur].append(c);
            if(cur == 0 || cur == numRows - 1){
                going = !going;
            }
            cur += going ? 1 : -1;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder row : rows){
            res.append(row);

        }
        return res.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int numRows = sc.nextInt();
        System.out.println(convert(s, numRows));
    }
}