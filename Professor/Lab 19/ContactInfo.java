//KYAW SOE LWIN
//Lab19
//29 November
//The program is about storing infomation about people' contacts
public class ContactInfo
{
    private String name;
    private String businessPhone;
    private String cellPhone;
    private String email;
    private String address;

    public ContactInfo()
    {
        name="No Name yet";
        businessPhone="No BusinessPhone yet";
        cellPhone="No CellPhone yet";
        email="No email yet";
        address="No address yet";
    }


    public ContactInfo(String data)
    {
        String[] array=data.split(",");
        name= array[0].trim().isEmpty()?"No Name":array[0].trim();
        businessPhone=array[1].trim().isEmpty()?"No Business Phone":array[1].trim();
        cellPhone=array[2].trim().isEmpty()?"No CellPhone":array[2].trim();
        email=array[3].trim().isEmpty()?"No Email":array[3].trim();
        address= array[4].trim().isEmpty()?"No Address": array[4].trim();

    }

    @Override
    public String toString()
    {
        return "Name: "+name+
               "\nBusiness Phone: "+businessPhone+
               "\nCellPhone: "+cellPhone+
               "\nEmail Address: "+email+
               "\nAddress: "+address;
    }
}