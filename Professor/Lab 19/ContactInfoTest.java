//KYAW SOE LWIN
//Lab19
//29 November
//The program is about storing infomation about people' contacts
public class ContactInfoTest
{
    public static void main(String[] args) 
    {
        ContactInfo[] contacts=new ContactInfo[4];
        contacts[0]=new ContactInfo("Doom,62394,67453,doom@my.smccd.edu,82 San Miguel Avenue");
        contacts[1]=new ContactInfo("Daisy,65734,28567,daisy@my.smccd.edu, ");
        contacts[2]=new ContactInfo("Fury,45366,46234, ,Carter Avenue");
        contacts[3]=new ContactInfo();

        System.out.println("Contacts: ");

        for (int i = 0; i < contacts.length; i++)
        {
            System.out.println(contacts[i]);
            System.out.println("------------------------");
        }
    }
}