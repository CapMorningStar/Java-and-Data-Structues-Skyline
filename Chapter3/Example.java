package Chapter3;
import javax.swing.JOptionPane;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int response=JOptionPane.showConfirmDialog(null, "Do you want a ham sandwich","Menu",
													JOptionPane.YES_NO_OPTION);
		if(response == JOptionPane.YES_OPTION) 
		{
			int count=Integer.parseInt(JOptionPane.showInputDialog(null,"How many ham sandwiches do  you want"));
			JOptionPane.showMessageDialog(null, "You have ordered "+count+" sandwiches\n Thank you");
			
		}else
		{
			JOptionPane.showMessageDialog(null, "Thank you");
		}
	
		
	}

}
