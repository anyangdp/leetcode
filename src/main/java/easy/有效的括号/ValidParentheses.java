package easy.有效的括号;

import java.util.*;

/**
 * @Author anyang
 * @CreateTime 2018/8/31
 * @Des
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.isEmpty())
            return true;
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();


    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.forEach(item -> System.out.println(item));
        System.out.println(stack.peek());
        stack.forEach(item -> System.out.println(item));
        stack.push('f');
        stack.forEach(item -> System.out.println(item));

    }
}
