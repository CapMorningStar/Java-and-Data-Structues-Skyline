//KYAW SOE LWIN
//Lab18
//24November
//The program is about converting dates from numerical month-day format.

import java.util.Scanner;

public class DateConverterTest
{   public static void main(String[] args) 
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter another date (month/day) or 'quit' to exit: ");
    String user=input.nextLine();
    while(!user.equalsIgnoreCase("quit"))
    {
        try
        {
            DateConverter.convertDate(user);;
        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Enter another date (month/day) or 'quit' to exit: ");
        user=input.nextLine();
    }
    input.close();
    System.out.println("Program exited.");
    }
    
}