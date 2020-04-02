package eg.edu.alexu.csd.datastructure.stack.cs;

import java.util.Scanner;

public class UIApplication {

	public static void main(String[] args) {
		ExpressionEvaluator EE = new ExpressionEvaluator();
		String str;
		Scanner in = new Scanner(System.in);
		
		//to test infix to postfix and evaluate giving infix expression
		///*
		while(true) {
			System.out.println("Please enter Infix expression");
			str = EE.infixToPostfix(in.nextLine());
			System.out.println("Postfix expression is " + str);
			System.out.println("Value is " + EE.evaluate(str));
		}
		//*/
		//
		
		
		//to test evaluate giving postfix expression
		/*
		while(true) {
			System.out.println("Please enter postfix expression");
			str = in.nextLine();
			System.out.println("Value is " + EE.evaluate(str));
		}
		*/
		//
	}

}
