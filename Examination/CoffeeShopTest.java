//KYAW SOE LWIN
//Final Exam
//11 December
//The program is about calculating time based on customers' Coffees orders and Lattes orders

public class CoffeeShopTest 
{
    public static void main(String[] args)
     {
        String[] customers = {"Andrew", "Barbara", "Carla", "Dan"};
        int[] coffees = {12, 24, 36, 12};
        int[] lattes = {12, 8, 24, 16};

        System.out.println("Customers\tCoffees\tLattes\tTime");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < customers.length; i++) 
        {
            int coffeeTime = CoffeeShop.calculateTime(coffees[i], 12);
            int latteTime = CoffeeShop.calculateTime(lattes[i], 8);
            
            int maxTime = CoffeeShop.maximumTime(coffeeTime, latteTime);

            System.out.printf("%s\t\t%d\t%d\t%d",customers[i],coffees[i],lattes[i],maxTime);
            System.out.println();
        }
    }
}