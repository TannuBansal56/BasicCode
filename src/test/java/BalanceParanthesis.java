import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class BalanceParanthesis {
    public static void checkBalance(String s){
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))==(stack.lastElement())){
                    stack.pop();
                }
                else{
                    System.out.println("String is not balanced parenthesis");
                    break;
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        if(stack.empty()){
            System.out.println("String is balanced");
        }
    }

    public static void main(String args[]){
    checkBalance("[[({})(({{[]}}))]])");

    }
}
