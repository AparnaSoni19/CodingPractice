package validparentheses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
//create map of ('(', ')','{', '}','[', ']');
// take each char from string and check in  if available in map ,if yes add to stack
//if not available in map ,pop the stack ,searched poped value in map and copmare it with string char
public class ValidParentheses {
    public static void main(String[] args) {
        String value = "((";
        if (ValidParentheses.checkValidParentheses(value)) {
            System.out.println("Valid Parantheses");
        } else {
            System.out.println("Not a Valid Parantheses");
        }
    }

    private static boolean  checkValidParentheses(String value) {
        boolean validParantheses = false;
        final Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        if (value.length() % 2 != 0) {
            return validParantheses;
        } else {
            char[] chars = value.toCharArray();
            for (Character charValue :chars) {
                if(map.containsKey(charValue))
                {
                    stack.push(charValue);
                }else {
                    if(stack.isEmpty())
                    {
                        return validParantheses=false;
                    }
                    Character stackVal = stack.pop();
                    if(map.get(stackVal)!=charValue)
                    {
                        return validParantheses=false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}

