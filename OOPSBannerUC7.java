public class OOPSBannerUC7 {

    /**
     * Inner Static Class to store Character and its Pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for Character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for Pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to find pattern for a character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap p : patterns) {
            if (p.getCharacter() == ch) {
                return p.getPattern();
            }
        }
        return new String[0];
    }

    public static void main(String[] args) {

        // Define patterns for O, P, S
        CharacterPatternMap[] patterns = {

                new CharacterPatternMap('O', new String[]{
                        " *****  ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        " *****  "
                }),

                new CharacterPatternMap('P', new String[]{
                        " *****  ",
                        "*     * ",
                        "*     * ",
                        " *****  ",
                        "*      ",
                        "*      ",
                        "*      "
                }),

                new CharacterPatternMap('S', new String[]{
                        " *****  ",
                        "*      ",
                        "*      ",
                        " *****  ",
                        "      * ",
                        "      * ",
                        " *****  "
                })
        };

        String word = "OOPS";

        // Print banner
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                String[] pattern = getCharacterPattern(c, patterns);
                line.append(pattern[row]);
            }

            System.out.println(line);
        }
    }
}