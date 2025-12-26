//KYAW SOE LWIN
//Lab 15
//7 November
//This program is about informations of Plumbers

public class Test
{
    public static void main(String[] args)
    {
        Plumber p1=new Plumber("KYAW GYI","West",15.5);
        Plumber p2=new Plumber("Wutyee","East", 10);
        Plumber p3=new Plumber("KYAW GYI","West",15.5);
       
        System.out.println("Plumber 1 ");
        p1.writeOutput();
        System.out.println();

        System.out.println("Plumber 2 ");
        p2.writeOutput();
        System.out.println();

        System.out.println("Plumber 3 ");
        p3.writeOutput();
        System.out.println();
    
        System.out.println("Plumber 1 is equal to Plumber 3: "+p1.hasSameDetails(p3));
        System.out.println("Plumber 1 is equal to Plumber 2: "+p1.hasSameDetails(p2));

      

    }
}