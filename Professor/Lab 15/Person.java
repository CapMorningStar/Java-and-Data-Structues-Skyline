//KYAW SOE LWIN
//Lab 15
//7 November
//This program is about informations of Plumbers

public class Person
{
    private String name=" ";


    public Person()
    {
        name="Unknown name";
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
        System.out.println("Name: "+getName());
    }
}