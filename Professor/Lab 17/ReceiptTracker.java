//KYAW SOE LWIN
//November 18
//Lab17
//This program is about doucmenting receipts from Online Club

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReceiptTracker
{
    private double totalReceipts=0.0;

    public void totalReceipts()
    {
        Scanner input=new Scanner(System.in);
       
       
        
        
        while(totalReceipts<10.0)
        {      
            System.out.print("Enter the amounts: $");
            

            try 
            {
                double receipt=input.nextDouble();
                if(receipt==0)
                {
                    throw new IllegalArgumentException("Error: The The Reciept amount is zero ");
                }
                else
                if(receipt<0)
                {
                    throw new IllegalArgumentException("Error: Reciept cannot be less than zero");
                    
                }
                else
                if(receipt>10)
                {   
                    throw new IllegalArgumentException("Error: Receipt total greater than $10 ");
                }
                else
                
                {
                    totalReceipts+=receipt;
                    
                }
                
                
            } 
            catch (InputMismatchException e) 
            {
                System.out.println("Error: Invalid Input. Please enter valid amount");
                input.next();
            }
            catch (IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
                input.next();
            }

            
        }
        System.out.println();
        System.out.println("total Receipt: $"+totalReceipts);
    }
}