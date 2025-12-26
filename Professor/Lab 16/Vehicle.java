//KYAW SOE LWIN
//7 November
//Lab16
//The program is about information about Trucks


public class Vehicle extends Person
{
    private  String manufacturer;
    private int numberOfCylinder;

    public Vehicle()
    {
        super("Unknown");
        manufacturer="Unknown";
        numberOfCylinder=0;
        
    }
    public Vehicle(String owner,String newManufacturer, int newCylinder)
    {
        super(owner);
        manufacturer=newManufacturer;
        numberOfCylinder=newCylinder;
       
    }       

    public String getManufacturer()
    {
        return manufacturer;     

    }

    public int getNumberOfCylinder()
    {
        return numberOfCylinder;
    }
    
    public boolean hasSameDetails(Vehicle otherVehicle)
    {
        return super.hasSameDetails(otherVehicle)&&
               manufacturer.equalsIgnoreCase(otherVehicle.manufacturer)&& 
               numberOfCylinder==otherVehicle.numberOfCylinder;
    }

    @Override
    public void writeOutput()
    {
        super.writeOutput();;
        System.out.println("Manufacturer: "+manufacturer);
        System.out.println("Number of Cylinder: "+numberOfCylinder);
    }


}