/////////////////////////////////
// Andrea Pettinà 2148010
// Pietro Vigolo 2137984
/////////////////////////////////

package it.unipd.mtss;

/**
 * Classe per la stampa in formato ASCII Art dei numeri romani.
 */
public class RomanPrinter {

    private static final String[] I = {
        "  _____  ",
        " |_   _| ",
        "   | |   ",
        "   | |   ",
        "  _| |_  ",
        " |_____| "
    };

    private static final String[] V = {
        " __      __ ",
        " \\ \\    / / ",
        "  \\ \\  / /  ",
        "   \\ \\/ /   ",
        "    \\  /    ",
        "     \\/     "
    };

    private static final String[] X = {
        " __    __ ",
        " \\ \\  / / ",
        "  \\ \\/ /  ",
        "   >  <   ",
        "  / /\\ \\  ",
        " /_/  \\_\\ "
    };

    private static final String[] L = {
        "  _       ",
        " | |      ",
        " | |      ",
        " | |      ",
        " | |____  ",
        " |______| "
    };

    private static final String[] C = {
        "  _____  ",
        " / ____| ",
        "| |      ",
        "| |      ",
        "| |____  ",
        " \\_____| "
    };

    private static final String[] D = {
        "  _____   ",
        " |  __ \\  ",
        " | |  | | ",
        " | |  | | ",
        " | |__| | ",
        " |_____/  "
    };

    private static final String[] M = {
        "  __  __  ",
        " |  \\/  | ",
        " | \\  / | ",
        " | |\\/| | ",
        " | |  | | ",
        " |_|  |_| "
    };

    // Costruttore privato per nascondere quello pubblico implicito
    private RomanPrinter() {
    }

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < romanNumber.length(); j++) {
                result.append(getLine(romanNumber.charAt(j), i));
                // Aggiunge spazio tra i caratteri se non è l'ultimo
                if (j != romanNumber.length() - 1) {
                    result.append(" ");
                }
            }
            result.append("\n");
        }

        return result.toString();
    }

    private static String getLine(char c, int index) {
        switch (c) {
            case 'I': return I[index];
            case 'V': return V[index];
            case 'X': return X[index];
            case 'L': return L[index];
            case 'C': return C[index];
            case 'D': return D[index];
            case 'M': return M[index];
            default: return "";
        }
    }
}