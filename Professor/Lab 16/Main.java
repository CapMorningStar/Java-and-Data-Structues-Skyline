//KYAW SOE LWIN
//7 November
//Lab16
//The program is about information about Trucks
public class Main
{
    public static void main(String[] args)
    {
        Truck truck1=new Truck("KYAW SOE LWIN", "FORD", 6, 3.5, 5.0);
        Truck truck2=new Truck("SWAN", "Lamboghini", 12, 5.5, 8.0);
        Truck truck3=new Truck("KYAW SOE LWIN", "FORD", 6, 3.5, 5.0);

        System.out.println("Output for Truck 1:");
        truck1.writeOutput();
        System.out.println();

        System.out.println("Output for Truck 2:");
        truck2.writeOutput();
        System.out.println();

        System.out.println("Output for Truck 3:");
        truck3.writeOutput();
        System.out.println();

        System.out.println("Do Truck 1 and Truck 2 have the same details? " + truck1.hasSameDetails(truck2));
        System.out.println("Do Truck 1 and Truck 3 have the same details? " + truck1.hasSameDetails(truck3));



    }
}