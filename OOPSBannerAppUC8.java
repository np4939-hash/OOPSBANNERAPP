import java.util.HashMap;

/**
 * OOPSBannerApp UC8 - Final Implementation using Collections (HashMap)
 * uses HashMap for O(1) retrieval and StringBuilder for efficient rendering.
 * @author Neha
 * @version 8.0
 */
public class OOPSBannerAppUC8 {

    public static void main(String[] args) {
        // Step 1: Initialize the Character Map
        HashMap<Character, String[]> charMap = createCharacterMap();

        // Step 2: Display the banner for the message "OOPS"
        displayBanner("OOPS", charMap);
    }

    /**
     * Creates a HashMap to store character patterns.
     * Key: Character, Value: String array of the pattern
     */
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            " *** ", "** **", "** **", "** **", "** **", "** **", " *** "
        });
        map.put('P', new String[]{
            "***** ", "** ** ", "** ** ", "***** ", "** ", "** ", "** "
        });
        map.put('S', new String[]{
            " *****", "** ", "** ", " **** ", "    **", "    **", "***** "
        });

        return map;
    }

    /**
     * Renders the banner message horizontally using StringBuilder
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        int patternHeight = 7; // Assuming all patterns have 7 lines

        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            
            for (char ch : message.toCharArray()) {
                if (charMap.containsKey(ch)) {
                    sb.append(charMap.get(ch)[line]).append("  ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}