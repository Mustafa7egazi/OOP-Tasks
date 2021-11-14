
package discount;

/**
 *
 * @author Mustafa R. Hegazy
 */
import java.util.Scanner;
public class Discount {

    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;

    public static double getServiceDiscount(String type) {
        switch (type) {
            case "Premium":
                return serviceDiscountPremium;
            case "Gold":
                return serviceDiscountGold;
            case "Silver":
                return serviceDiscountSilver;
            default:
                throw new IllegalArgumentException("wrong service type specified");
        }
    }

    public static double getProductDiscount(String type) {
        switch (type) {
            case "Premium":
                return productDiscountPremium;
            case "Gold":
                return productDiscountGold;
            case "Silver":
                return productDiscountSilver;
            default:
                throw new IllegalArgumentException("wrong service type specified");
        }
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for service discount"
                + " or 2 for ordinary product discount");
        int choice = in.nextInt();
        if(choice==1)
        {
            System.out.println("Enter your membership type");
            String t = in.next();
            System.out.println("Your Discount: "+getServiceDiscount(t));
        }
        else
        {
            System.out.println("Enter your membership type");
            String t = in.next();
            System.out.println("Your Discount: "+getProductDiscount(t));
        }        
    }
}
