package AldrinClockify;

import java.util.Scanner;

public class SampleNumberValidation {

	public static void main (String args [])
	{
		Scanner scanP = new Scanner (System.in);
		System.out.println ("Enter the word");
		
		String s = scanP.nextLine();
		scanP.close();
		
		String [] p = s.split("");
		String reverseString = "";
		
		for (int i=p.length -1; i>=0 ; i--) {
			reverseString = reverseString +p [i];
			
		}
		System.out.println(reverseString);
		if (s.equals (reverseString)) {
			System.out.println("Palindrome");
		}
			else
			{
				System.out.print("Not");
			}
		}
		
			
		}
		



