import java.util.*;
public class leet20{
    public static boolean isvalid(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(ch == ')' && top != '('){
                    return false;
                }
                if(ch == ']' && top != '['){
                    return false;
                }
                if(ch == '}' && top != '{'){
                    return false;
                }
            }
        }
    return stack.isEmpty();
    }
    public static void main(String[] args){
        String s = "{[()}]";
        System.out.println(isvalid(s));
    }
}

