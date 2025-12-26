//KYAW SOE LWIN
//6 September
//Lab5
//The program is about vending machine giving the change back when customer buy an item with 1 dollar.
package Chapter3;
import javax.swing.JOptionPane;
public class VendingMachine
{

	public static void main(String[] args) 
	{
		int cost,change,quarter,dime,nickel;
		String input=JOptionPane.showInputDialog(null,"Enter price of item(from 35 cents to a dollar, in 5-cent increments):");
		cost=Integer.parseInt(input);
		 
		if(cost<35) 
		 {
			JOptionPane.showMessageDialog(null, "Invalid Input:The cost is less than 35 cents");
		 }else if(cost >100) 
		 {
			 JOptionPane.showMessageDialog(null, "Invalid Input:The cost is more than a dollar");
		 }else if(cost%5 !=0)
		 {
			 JOptionPane.showMessageDialog(null, "Invalid Input:The cost is not integer of multiple of 5");
		 }else
		 {   change=100-cost;
			 quarter=change/25;
			 change%=25;
			 dime= change/10;
			 change%=10;
			 nickel=change/5;
			 JOptionPane.showMessageDialog(null,"You bought the item for "+cost
					 						+" cents and gave me a dollar,\n"
					 						+"so your change is\n"
					 						+"quarter: "+quarter
					 						+"\ndime: "+dime
					 						+"\nnickel: "+nickel);
		 }
		System.exit(0);
		
	}

}
