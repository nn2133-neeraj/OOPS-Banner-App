/**
 * OOPSBannerApp
 *
 * UC5: Concise array declaration and initialization
 * using String.join() within a single statement.
 *
 * @author Shukkur
 * @version 5.0
 */
public class UC5OOPSBannerApp{

    public static void main(String[] args) {

        String[] banner = {
                String.join("", " *****   ", " *****   ", " *****   ", " ***** "),
                String.join("", "*     * ", "*     * ", "*     * ", "*     *"),
                String.join("", "*     * ", "*     * ", "*     * ", "*      "),
                String.join("", "*     * ", "*     * ", " *****  ", " *****  "),
                String.join("", "*     * ", "*     * ", "*       ", "     *  "),
                String.join("", "*     * ", "*     * ", "*     * ", "*     * "),
                String.join("", " *****   ", " *****   ", " *****   ", " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}