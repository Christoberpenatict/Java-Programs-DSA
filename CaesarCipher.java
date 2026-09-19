import java.util.*;
public class CaesarCipher {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the Key: ");
        int key = ip.nextInt();
        System.out.println("Enter the String : ");
        String st =ip.nextLine();
        //int key = 3;
        //String st ="Welcome to My Code";
        String str = st.toUpperCase();
        System.out.println(str.toUpperCase());
        int[] arr = new int[str.length()];
        for(int i = 0; i < str.length(); i++){
            arr[i] = (int) str.charAt(i);
            if(arr[i] != 32){
                arr[i] = arr[i] - 'A';
                arr[i] = (arr[i] + key) % 26;
                arr[i] = arr[i] + 'A';
            }
            System.out.print((char)arr[i]);
        }
        //System.out.println(arr);
        System.out.println("\nSuccessfully coverted PLAIN TEXT to CIPHER TEXT ");

    }
}
