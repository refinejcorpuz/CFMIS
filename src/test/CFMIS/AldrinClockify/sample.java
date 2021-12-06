package AldrinClockify;

import java.util.Scanner;

public class sample {
	
	public static void main (String args[])
	{
		int num;
		System.out.println("Enter");
		Scanner input = new Scanner (System.in);
		num = input.nextInt();
		
		if (num % 2 == 0)
		System.out.println("Even");
		else
			System.out.println("Odd");
	}
	}