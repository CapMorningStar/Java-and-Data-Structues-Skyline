package Chapter3;
import java.util.Scanner;

public class SandwichOrder
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Prompt for and read the number of sandwiches
        System.out.print("Enter the number of sandwiches: ");
        int numberOfItems = input.nextInt();

        // Clear the newline left in the input buffer
        input.nextLine();

        // Prompt for and read the sandwich type (first letter)
        System.out.print("Enter the sandwich type (first letter, e.g., H, C, R, T, V): ");
        char menu = input.next().charAt(0);
        
        double priceOfItem = 0;
        String sandwich = "";

        // Switch based on the sandwich type character
        switch(menu) 
        {
            case 'H':
                priceOfItem = 8.5;
                sandwich = "ham sandwich";
                break;
            case 'C':
                priceOfItem = 8.0;
                sandwich = "chicken sandwich";
                break;
            case 'R':
                priceOfItem = 10.0;
                sandwich = "roast beef sandwich";
                break;
            case 'T':
                priceOfItem = 9.0;
                sandwich = "tuna sandwich";
                break;
            case 'V':
                priceOfItem = 8.5;
                sandwich = "vegetarian sandwich";
                break;
            default:
                System.out.println("Invalid sandwich type entered.");
                input.close();
                System.exit(0); // Exit the program if an invalid type is entered
        }

        double total = numberOfItems * priceOfItem;
        System.out.printf("%d %s $%.2f\n", numberOfItems, sandwich, total);

        // Close the scanner
        input.close();
    }
}
