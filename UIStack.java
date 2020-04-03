package eg.edu.alexu.csd.datastructure.stack.cs;

import java.util.Scanner;

public class UIStack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack s = new Stack();
		String str;
		int Operation;
		System.out.println("Please choose an action");
		System.out.println("-----------------------");
		System.out.println("1- Push a new Object");
		System.out.println("2- Pop last entered Object");
		System.out.println("3- Peek last entered Object");
		System.out.println("4- Print size of Stack");
		System.out.println("5- Check if Stack is empty");
		System.out.println("====================================================================");
		while(true) {//will keep running until pop or peek throw exception
			String c = in.nextLine();
			c = c.trim();
			Operation = 0;
			if(c.length()==1&&Character.isDigit(c.charAt(0)))
				Operation = Character.getNumericValue(c.charAt(0));//read required operation
			switch(Operation) {
			case 1 :
				System.out.println("Enter Object");
				str = in.nextLine();
				s.push(str);
				break;
			case 2 :
				System.out.println(s.pop());
				break;
			case 3 :
				System.out.println(s.peek());
				break;
			case 4 :
				System.out.println(s.size());
				break;
			case 5 :
				if(s.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Stack is not empty");
				break;
			default :
				System.out.println("Undefined Operation");
			}
			System.out.println("====================================================================");
			System.out.println("Please choose an action");//prepare for new operation
			System.out.println("-----------------------");
			System.out.println("1-  Push a new Object,... etc");
			
		}
	}

}
