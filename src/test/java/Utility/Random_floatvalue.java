package Utility;

import java.util.Random;

public class Random_floatvalue 
{
public static void main(String[] args)
{
	/* double start = 7;
     double end = 8;
     double random = new Random().nextDouble();
     double result = start + (random * (end - start));
     System.out.println(result);*/
	
	double start =0;
	  double end = 1;
	  double random = new Random().nextDouble();
	  double result = start + (random * (end - start));
	  
	  String num="7.1234";
	 
	  double num1=Double.valueOf(num);
	  double newamount=num1+result;
	 System.out.println(newamount);
}
}
