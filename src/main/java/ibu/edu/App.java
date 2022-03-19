package ibu.edu;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Stack<Integer> valueStack = new Stack<Integer>();
        Stack<String> opStack = new Stack<String>();
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your expression :");
        String[] expr = input.nextLine().split(" ");



        for (int i = 0 ; i < expr.length ; i++) {
            if (expr[i].equals("("));
            else if (expr[i].equals("+")) {
                opStack.push(expr[i]);
            } else if (expr[i].equals("-")) {
                opStack.push(expr[i]);
            } else if (expr[i].equals("*")) {
                opStack.push(expr[i]);
            } else if (expr[i].equals("/")) {
                opStack.push(expr[i]);
            } else if (expr[i].equals(")")){
                String op = opStack.pop();
                int a = valueStack.pop();

                if(op.equals("+")){
                    a = valueStack.pop() + a;
                } else if(op.equals("-")){
                    a = valueStack.pop() - a;
                } else if(op.equals("*")) {
                    a = valueStack.pop() - a;
                } else if(op.equals("/")) {
                    a = valueStack.pop() - a;
                }
                valueStack.push(a);
            }
            else{
                valueStack.push(Integer.parseInt(expr[i]));
            }
        }
        System.out.println(valueStack.pop());
    }
}
