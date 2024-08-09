package Stack_and_Queue_Questions;
import java.util.*;
public class min_add_valid_parenthesis {
	public int minAddToMakeValid(String s) {
        Stack <Character> stack= new Stack<>();
        for(char ch :s.toCharArray()) {
        	if(ch==')') {
        		if(!stack.isEmpty() || stack.peek()=='(') {
        			stack.pop();
        		}else {
        			stack.push(ch);
        		}
        	}else {
        		stack.push(ch);
        	}
        }
        return stack.size();
    }
}
