//KYAW SOE LWIN
//Final Exam
//11 December
//The program is about calculating time based on customers' Coffees orders and Lattes orders

public class CoffeeShop 
{
    public static int maximumTime(int time1, int time2) 
    {
        return (time1 > time2) ? time1 : time2;
    }

    public static int calculateTime(int items, int numbers)
    {
        return (items + numbers-1 ) / numbers;
    }

    
}