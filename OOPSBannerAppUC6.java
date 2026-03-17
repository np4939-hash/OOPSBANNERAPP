/**
 * OOPSBannerApp UC6 - Modular Pattern Generation using Static Methods
 * This version uses dedicated methods for each character to improve reusability.
 * @author Neha
 * @version 6.0
 */
public class OOPSBannerAppUC6 {

    public static void main(String[] args) {
        // Step 1: Call methods to get patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Step 2: Loop through and assemble the banner lines
        for (int i = 0; i < oPattern.length; i++) {
            // We use two O's, one P, and one S
            System.out.println(oPattern[i] + "  " + oPattern[i] + "  " + pPattern[i] + "  " + sPattern[i]);
        }
    }

    // Method for Letter O
    public static String[] getOPattern() {
        return new String[] {
            " *** ",
            "** **",
            "** **",
            "** **",
            "** **",
            "** **",
            " *** "
        };
    }

    // Method for Letter P
    public static String[] getPPattern() {
        return new String[] {
            "***** ",
            "** ** ",
            "** ** ",
            "***** ",
            "** ",
            "** ",
            "** "
        };
    }

    // Method for Letter S
    public static String[] getSPattern() {
        return new String[] {
            " *****",
            "** ",
            "** ",
            " **** ",
            "      **",
            "      **",
            "***** "
        };
    }
}