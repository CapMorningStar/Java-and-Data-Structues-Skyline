//KYAW SOE LWIN
//August 28
//Lab4
//The program is about asking offering sandwich to the customers.


import javax.swing.JOptionPane;

public class Sandwichshop 
{

	public static void main(String[] args)
	{
		
		int response=JOptionPane.showConfirmDialog(null,
		                        "Do you want a ham sandwich?",
								"Hello C",JOptionPane.YES_NO_OPTION);
		if( response==JOptionPane.YES_OPTION) 
		{
			int count=Integer.parseInt(JOptionPane.showInputDialog(null,
			"how many ham sandwiches do you want?"));
			JOptionPane.showMessageDialog(null,
			"You have ordered "+count+" sandwiches\n Thank you for ordering");
		}	
		else
		{
			JOptionPane.showMessageDialog(null, "Thank you");
		}
		System.exit(0);
	}

}
