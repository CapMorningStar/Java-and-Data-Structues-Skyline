public class FinalTest
{
    public static void main(String[] args)
    {
        String[] names={"Jane","Tom", "Mary", "Sue", "Jack"};
        int[] scores={4,1,2,3,4};
        int[] annualSalary={80000,80000,80000,80000,80000};
        
        Calculate cal=new Calculate(names, scores, annualSalary);
        cal.totalBonus();


    }
}