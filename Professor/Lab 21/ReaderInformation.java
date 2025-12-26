//KYAW SOE LWIN
//Lab20
//10 December
//The program is about reading the contact information from a text file

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderInformation
{
    public static void main(String[] args) 
    
    {   ContactInformation[] contact=new ContactInformation[4];
        
        String filepath="D:\\JJava\\Professor\\Lab 20\\Contacts.txt";
        try(BufferedReader br=new BufferedReader(new FileReader(filepath))) 
        {   
            String line;
            while((line=br.readLine()) !=null)
            {   int count=0;
                contact[count]=new ContactInformation(line);
                System.out.println(contact[count]);
                System.out.println("---------------------------------");
                count++;

            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}