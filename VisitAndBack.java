import java.util.*;
public class VisitAndBack {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        Stack<String> back = new Stack<>();
        String current = "homepage";
        while(true){
            String command = ip.nextLine();
            String[] parts = command.split(" ");
            if(parts[0].equals("VISIT")){
                current = parts[1];
                back.push(current);
            }
            else if(parts[0].equals("BACK") && !back.isEmpty()){
                current = back.pop();
               
            }
            else if(command.equals("END")){
                break;
            }
        }
        String rem;
        while(true){
            rem = back.pop();
            System.out.println(rem);
            if(back.isEmpty()){
                break;
            }
        }
    }
}
