/**
 * OOPSBannerApp - UC7: Store Character Pattern in an Inner Static Class
 * @author NithishKumar
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * Static Inner Class to encapsulate character and its banner pattern
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         * @param character The character (O, P, S)
         * @param pattern The 7-line ASCII pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return 7-line pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to assemble banner using stored patterns
     * @param characters Array of CharacterPatternMap objects
     * @return Combined banner lines
     */
    public static String[] buildBanner(CharacterPatternMap[] characters) {

        StringBuilder[] bannerLines = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        for (CharacterPatternMap cp : characters) {
            String[] pattern = cp.getPattern();
            for (int i = 0; i < 7; i++) {
                bannerLines[i].append(pattern[i]).append(" ");
            }
        }

        String[] result = new String[7];
        for (int i = 0; i < 7; i++) {
            result[i] = bannerLines[i].toString();
        }

        return result;
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        // Define patterns for O, P, S
        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                "****  ",
                "*   * ",
                "*   * ",
                "****  ",
                "*     ",
                "*     ",
                "*     "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " *****",
                "      *",
                "      *",
                " *****"
        });

        // Array of objects (OOPS)
        CharacterPatternMap[] word = {O, O, P, S};

        // Build banner
        String[] banner = buildBanner(word);

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}