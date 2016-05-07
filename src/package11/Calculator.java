package package11;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math math= new Math();
		
		System.out.println("This is A Simple Java Calculator");
		
		System.out.println("------------------------------------");
		
		Scanner a = new Scanner(System.in);
		int num1,num2;
	
		
		
		System.out.print("Enter the first number:");
            num1 = a.nextInt();
            
        System.out.print("Enter the Second number:");
        	num2 = a.nextInt();
        	
        System.out.print("Enter the operation(+,-,x,/):");
        	String operator= a.next();
        	
        if (operator.equals("+"))
        	System.out.println(math.Add(num1, num2));
     
        	else if (operator.equals("-"))
        	System.out.println(math.Subtract(num1, num2));
        
        		else if (operator.equals("x"))
        			System.out.println(math.Multiply(num1, num2));
        
        			else if (operator.equals("/"))
        				System.out.print((double)(math.Divide(num1, num2)));
        	
        				else
        					System.out.println("Enter a correct operator");
              	      	
        	
	}

}
