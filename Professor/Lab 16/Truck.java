//KYAW SOE LWIN
//7 November
//Lab16
//The program is about information about Trucks

public class Truck extends Vehicle
{
    private double loadCapacity;
    private double towingCapacity;

    public Truck()
    {
        super("Unknown","Unknown",0);
        loadCapacity=0.0;
        towingCapacity=0.0;

    }
    public Truck(String owner, String manufacturer, int numberOfCylinder, double newLoadCapacity, double newTowingCapacity)
    {
        super(owner,manufacturer,numberOfCylinder);
        loadCapacity=newLoadCapacity;
        towingCapacity=newTowingCapacity;

    }

    public double getLoadCapacity()
    {
        return loadCapacity;
    }

    public double getTowingCapacity()
    {
        return towingCapacity;
    }

    
    public boolean hasSameDetails(Truck otheTruck)
    {
        return super.hasSameDetails(otheTruck) 
               && loadCapacity== otheTruck.loadCapacity 
               && towingCapacity==otheTruck.towingCapacity;
    }

    @Override
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Load Capacity: "+loadCapacity+" tons");
        System.out.println("Towing Capacity: "+towingCapacity+" tons");
    }

}