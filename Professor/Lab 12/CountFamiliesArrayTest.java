//KYAW SOE LWIN
//28October
//Lab12
//The program should count the number of families whose income is below a certain value
import java.util.Scanner;
public class CountFamiliesArrayTest
{
    public static void main(String[] args)
     {  
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number of families: ");
        int k= input.nextInt();
        
        CountFamiliesArray family=new CountFamiliesArray(k);
        family.countlowIncomeFamilies();
        input.close();
    }
}