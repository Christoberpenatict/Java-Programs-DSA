import java.util.*;
public class strpro {
    public static void main(String[] args){
       //String str = "have a nice day";
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
        str = str.replace(" ","");
        int len = str.length();
        int rows = (int) Math.floor(Math.sqrt(len));
        int cols = (int) Math.ceil(Math.sqrt(len));
        char[][] mat = new char[rows][cols];
        int flag = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                mat[i][j] = str.charAt(flag);
                flag++;
            }
        }
         for(int i = 0; i < cols; i++){
            for(int j = 0; j < rows; j++){
                System.out.print(mat[j][i]);
            }
            System.out.print(" ");
        }
        

    }
}
