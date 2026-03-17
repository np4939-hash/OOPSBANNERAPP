/**
 * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
 * * This version extends UC4 by combining declaration and initialization 
 * in a single statement for better readability.
 * * @author Neha
 * @version 5.0
 */
public class OOPSBannerAppUC5 {
    public static void main(String[] args) {
        // UC5 Goal: Declare and initialize the array in ONE statement
        String[] lines = {
            String.join("  ", " *** ", " *** ", "***** ", " *****"),
            String.join("  ", "** **", "** **", "** **", "** "),
            String.join("  ", "** **", "** **", "** **", "** "),
            String.join("  ", "** **", "** **", "***** ", " *** "),
            String.join("  ", "** **", "** **", "** ", "   ** "),
            String.join("  ", "** **", "** **", "** ", "   ** "),
            String.join("  ", " *** ", " *** ", "** ", "***** ")
        };

        // Use an enhanced for-loop to display the banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}