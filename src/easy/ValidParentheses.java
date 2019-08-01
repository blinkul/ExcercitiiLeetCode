package easy;

//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//        An input string is valid if:
//
//        Open brackets must be closed by the same type of brackets.
//        Open brackets must be closed in the correct order.
//
//        Note that an empty string is also considered valid.

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class ValidParentheses {

    static private final Map<Character, Character> map = new HashMap<>();
    static private final Map<Integer,String> testData = new HashMap<>();

    public static void main(String[] args) {
        loadMap();
        loadTestData();

        for( Map.Entry test : testData.entrySet()) {

            boolean result = validate((String) test.getValue());

            if (result)
                System.out.println(":)   \t" + "\t" + test);
            else
                System.out.println(":( <<\t" + "\t" + test);
        }
    }

    private static boolean validate(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // if is a closing bracket
            if (map.containsKey(c)) {

                char topElement = stack.empty() ? '#' : stack.pop();

                if(topElement != map.get(c))
                    return false;

            } else {
                stack.push(c);
            }

        }

        return true;
    }

    private static void loadMap() {
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
    }

    private static void loadTestData() {
        testData.put(1, "{][]");
        testData.put(2, "[](){}");
        testData.put(3, "{[(())]}");
    }

}
