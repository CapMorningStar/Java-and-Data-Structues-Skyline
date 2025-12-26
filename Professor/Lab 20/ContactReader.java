
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContactReader
{
    public static void main(String[] args) 
    {
        ContactInfo[] contacts=new ContactInfo[5];
        int count=0;

        try(BufferedReader br=new BufferedReader(new FileReader("D:\\JJava\\Professor\\Lab 20\\Contact.txt")))
        {
            String line;
            while((line= br.readLine()) !=null && count< contacts.length)
            {
                contacts[count]=new ContactInfo(line);
                count++;
            }
        } catch (IOException e)
        {
            System.out.println("Error reading file: "+e.getMessage());
        }

        System.out.println("Contacts");

        for(int i=0;i<count; i++)
        {
            System.out.println(contacts[i].toString());
            System.out.println("-----------------------");
        }

    }
}