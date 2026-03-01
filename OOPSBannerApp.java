/**
 * OOPSBannerApp - UC6: Static Methods
 * @author NithishKumar
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        String[] bannerLines = createBanner();
        printBanner(bannerLines);
    }

    // Method to create banner
    public static String[] createBanner() {
        return new String[] {
            String.join(" ", " *****  ", " *****  ", "****   ", " *****  "),
            String.join(" ", "*     * ", "*     * ", "*   *  ", "*       "),
            String.join(" ", "*     * ", "*     * ", "*   *  ", "*       "),
            String.join(" ", "*     * ", "*     * ", "****   ", " *****  "),
            String.join(" ", "*     * ", "*     * ", "*      ", "      * "),
            String.join(" ", "*     * ", "*     * ", "*      ", "      * "),
            String.join(" ", " *****  ", " *****  ", "*      ", " *****  ")
        };
    }

    // Method to print banner
    public static void printBanner(String[] bannerLines) {
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}