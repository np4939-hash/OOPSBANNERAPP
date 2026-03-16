/**
 * OOPSBannerApp UC3 - OOPS Banner Application (Use Case 3)
 * This class improves efficiency by using String.join() to construct
 * the banner lines, reducing memory overhead.
 * @author Neha
 * @version 3.0
 */
public class OOPSBannerAppUC3 {
    public static void main(String[] args) {
        // Constructing each line using String.join with " " as delimiter
        System.out.println(String.join("", "  *** ", " *** ", " ***** ", " **** "));
        System.out.println(String.join("", " ** ** ", "** ** ", " ** ", " ** ** "));
        System.out.println(String.join("", " ** ** ", "** ** ", " ** ", " ** ** "));
        System.out.println(String.join("", " ** ** ", "** ** ", " ***** ", " **** "));
        System.out.println(String.join("", " ** ** ", "** ** ", " ** ", " ** "));
        System.out.println(String.join("", " ** ** ", "** ** ", " ** ", " ** "));
        System.out.println(String.join("", "  *** ", " *** ", " ** ", " ***** "));
    }
}
    

