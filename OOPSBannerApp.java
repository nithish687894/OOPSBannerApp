import java.util.HashMap;
import java.util.Map;

public class BannerAppUC8 {

    private static Map<Character, String[]> charPatternMap = new HashMap<>();

    static {
        initializePatterns();
    }

    private static void initializePatterns() {
        charPatternMap.put('O', new String[]{
                " **** ",
                "*    *",
                "*    *",
                "*    *",
                " **** "
        });

        charPatternMap.put('P', new String[]{
                "***** ",
                "*    *",
                "***** ",
                "*     ",
                "*     "
        });

        charPatternMap.put('S', new String[]{
                " **** ",
                "*     ",
                " **** ",
                "     *",
                " **** "
        });
    }

    public static void displayBanner(String message) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            StringBuilder rowBuilder = new StringBuilder();
            for (char c : message.toCharArray()) {
                c = Character.toUpperCase(c);
                String[] pattern = charPatternMap.get(c);
                if (pattern != null) {
                    rowBuilder.append(pattern[i]).append("  ");
                } else {
                    rowBuilder.append("      ");
                }
            }
            System.out.println(rowBuilder.toString());
        }
    }

    public static void main(String[] args) {
        String message = "OOPS";
        displayBanner(message);
    }
}