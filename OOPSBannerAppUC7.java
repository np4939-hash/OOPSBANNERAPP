/**
 * OOPSBannerApp UC7 - Encapsulating Character Patterns in a Class
 * This version uses a dedicated class to map characters to their ASCII patterns.
 * @author Neha
 * @version 7.0
 */
public class OOPSBannerAppUC7 {

    // Internal class to hold the character and its pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor to initialize the object
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        // Step 1: Create objects for each letter
        CharacterPattern oChar = new CharacterPattern('O', new String[]{
            " *** ", "** **", "** **", "** **", "** **", "** **", " *** "
        });

        CharacterPattern pChar = new CharacterPattern('P', new String[]{
            "***** ", "** ** ", "** ** ", "***** ", "** ", "** ", "** "
        });

        CharacterPattern sChar = new CharacterPattern('S', new String[]{
            " *****", "** ", "** ", " **** ", "    **", "    **", "***** "
        });

        // Step 2: Assemble and print using the objects
        String[] oLines = oChar.getPattern();
        String[] pLines = pChar.getPattern();
        String[] sLines = sChar.getPattern();

        for (int i = 0; i < 7; i++) {
            System.out.println(oLines[i] + "  " + oLines[i] + "  " + pLines[i] + "  " + sLines[i]);
        }
    }
}
