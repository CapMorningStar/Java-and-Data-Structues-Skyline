//KYAW SOE LWIN
//7 November
//Lab16
//The program is about information about Trucks
public class Person
{
    private  String name=" ";


    public Person()
    {
        name="Unknown";
    }
    
    public Person(String personName)
    {
        name=personName;
        
    }

    public String getName()
    {
        return name;
    }

    public boolean hasSameDetails(Person otherPerson) 
    {
        return name.equalsIgnoreCase(otherPerson.name); 
        
    }

    
    public void writeOutput()
    {
    System.out.println("Name: "+name);
    }

}