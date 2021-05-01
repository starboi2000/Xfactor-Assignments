

import java.io.*;
import java.util.*;  

class Main
{
	
	
	static int divide(int dividend, int divisor)
	{
		
		
		int sign = ((dividend < 0) ^
				(divisor < 0)) ? -1 : 1;
	
	
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);
	
		
		int quotient = 0;
		
		while (dividend >= divisor)
		{
			dividend -= divisor;
			++quotient;
		}
	
		return sign * quotient;
	}
	
	public static void main (String[] args)
	{
		Scanner sc= new Scanner(System.in);      
        System.out.print("Enter Numarator- ");  
        int a= sc.nextInt();  
        System.out.print("Enter  Denominator- ");  
        int b= sc.nextInt();  
		
		System.out.println(divide(a, b));
		
	}
}

