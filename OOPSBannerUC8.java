import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    /**
     * Method to create and return the character pattern map
     */
    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        });

        patternMap.put('P', new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                " *****  ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " *****  ",
                "*      ",
                "*      ",
                " *****  ",
                "      * ",
                "      * ",
                " *****  "
        });

        return patternMap;
    }

    /**
     * Method to render banner text
     */
    public static void renderBanner(String text, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : text.toCharArray()) {

                String[] pattern = patternMap.get(c);

                if (pattern != null) {
                    line.append(pattern[row]);
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        String message = "OOPS";

        Map<Character, String[]> patternMap = createPatternMap();

        renderBanner(message, patternMap);
    }
}