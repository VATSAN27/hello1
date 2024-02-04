import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float totalCost, costToPaid, discount;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Total Amount of Shopping: ");
        totalCost = scan.nextFloat();

        if(totalCost<=500)
        {
            costToPaid = totalCost;
            System.out.println("\nThe cost to be Paid is: " + costToPaid);
        }
        else if(totalCost>500 && totalCost<=1000)
        {
            discount = (totalCost*10)/100;
            costToPaid = totalCost - discount;
            System.out.println("\nThe cost to be Paid is: " + costToPaid);
        }
        else if(totalCost>1000) {
            discount = (totalCost * 20) / 100;
            costToPaid = totalCost - discount;

            System.out.println("\nThe cost to be Paid is: " + costToPaid);
        }
        }
}