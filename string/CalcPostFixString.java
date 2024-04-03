/*
 * Reference : https://www.geeksforgeeks.org/evaluation-of-postfix-expression/
 * 
 * The answer is 879-2*+ = 4.
 * To evaluate a postfix expression, you can use a stack. The steps are as follows:
 * Create an operand stack.
 * If the character is an operand, push it to the operand stack.
 * If the character is an operator, pop two operands from the stack, operate, and push the result back to the stack.
 * After the entire expression has been traversed, pop the final result from the stack.
 * 
 * NOTE : Character to Integer  : Character.getNumericValue(s.charAt(i))
 * 
 */

import java.util.ArrayList;

public class CalcPostFixString {
    public static void main(String[] args) {
        String s = "879-2*+";
        System.out.println(postFix(s));

    }

    public static int postFix(String s) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '/' || s.charAt(i) == '*' || s.charAt(i) == '+' || s.charAt(i) == '-') {

                int a = list.remove(list.size() - 2);
                int b = list.remove(list.size() - 1);
                int c = 0;

                switch (s.charAt(i)) {

                    case '/':
                        c = a / b;
                        break;
                    case '*':
                        c = a * b;
                        break;
                    case '+':
                        c = a + b;
                        break;
                    case '-':
                        c = a - b;
                        break;
                    default:
                        break;
                }
                list.add(c);
                System.out.println(list);
            } else {
                list.add(Character.getNumericValue(s.charAt(i)));
                System.out.println("noraml  : " + list);
            }

        }
        System.out.println(list);
        return list.get(0);
    }

}
