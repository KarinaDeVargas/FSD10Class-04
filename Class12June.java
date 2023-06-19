package June12th;

import java.util.Scanner;

public class Class12June {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myStatement = "Welcome to [Karina de Vargas] website!";
		int startChar = myStatement.indexOf("[");
		int endChar = myStatement.indexOf("]");
		
		System.out.println(startChar);
		
		System.out.println(endChar);
		
		String newMyStatement = myStatement.substring(startChar+1, endChar);
		System.out.println(newMyStatement);
		
		String myStat = "This is test for exc";
		String sttRFirstchar = myStat.substring(1);
		System.out.println(sttRFirstchar);		
		String sttRLastchar = myStat.substring(0, myStat.length()-1);
		System.out.println(sttRLastchar);
		
		
//===================//
		Scanner kb = new Scanner(System.in);
		
		int sum = 0;
		int num = 0;
		
		do 
		{
			sum = sum + num;
			System.out.println("Please enter a positive number:");
			num = kb.nextInt();
		}
		while(num>0);
			System.out.println("The sum is");
		
		
	}

}
