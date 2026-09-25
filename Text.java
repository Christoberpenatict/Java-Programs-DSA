import java.util.*;
class Text{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        StringBuilder text = new StringBuilder();
        Stack<String> history = new Stack<>();
        for(int i = 0; i < n; i++){
            int op = ip.nextInt();
            if(op == 1){
                history.push(text.toString());
                text.append(ip.next());
            }
            else if(op == 2){
                int k = ip.nextInt();
                history.push(text.toString());
                text.delete(text.length() - k , text.length());
            }
            else if(op == 3){
                System.out.println(text.charAt(ip.nextInt() - 1));
            }
            else{
                if(!history.isEmpty()){
                    text = new StringBuilder(history.pop());
                }
            }
        }
    }
}