//KYAW SOE LWIN
//September 11
//Lab6
//The program is about a service charge for cashing a check.

import java.util.Scanner;
public class ServiceCharge
{

	public static void main(String[] args)
	{
		double checkAmount;
		double serviceCharge;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your checkAmount:$");
		checkAmount=input.nextDouble();
		if(checkAmount<10) 
		{
			serviceCharge= 1;
		}else if(checkAmount>=10 && checkAmount<100)
		{
			serviceCharge= 0.10 * checkAmount;
		}else if(checkAmount>=100 && checkAmount<1000) 
		{
			serviceCharge=5+(checkAmount * 0.05);
		}else 
		{
			serviceCharge=40+(checkAmount * 0.01);
		}
		double total=checkAmount-serviceCharge;
		System.out.printf("$%.2f  (amount of check)\n",checkAmount);
		System.out.printf("$%.2f  (service charge)\n", serviceCharge);
		System.out.printf("$%.2f  (amount returned to you)\n", total);

	}

}
