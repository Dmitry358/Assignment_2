////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////

////////////////////   V-6   ////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    protected static String printAsciiArt(String romanNumber) {
        String stringaAscii = "";
        boolean correctInput = isInputCorrect(romanNumber);

        if(correctInput) {
            for (int i = 0; i < romanNumber.length(); i++) {
                char aux = romanNumber.charAt(i);
                if(aux == 'I'){ stringaAscii += print_I(); }
                else if(aux == 'V') { stringaAscii += print_V(); }
            }
        }

        return correctInput ? stringaAscii : null;
    }

    protected static boolean isInputCorrect(String romanNumber) {
        boolean correctInput = true;

        if(romanNumber == null) { correctInput = false; }

        else if(romanNumber.length() < 1 || romanNumber.length() > 3) {
            correctInput = false;
        }

        else if(romanNumber.charAt(0) == 'V' && romanNumber.length() > 2) {
            correctInput = false;
        }

        for (int i = 0; correctInput && i < romanNumber.length(); i++){
            char aux = romanNumber.charAt(i);
            if( aux != 'I' && aux != 'V') { correctInput = false; }
        }

        return correctInput;
    }

    protected static String print_I() {
        String str_I = " _____\n"+
                       "|_   _|\n"+
                       "  | |\n"+
                       "  | |\n"+
                       " _| |_\n"+
                       "|_____|\n";

        System.out.println(str_I);
        return str_I;
    }

    protected static String print_V() {
        String str_V = "__      __\n"+
                       "\\ \\    / /\n"+
                       " \\ \\  / /\n"+
                       "  \\ \\/ /\n"+
                       "   \\  /\n"+
                       "    \\/\n";

        System.out.println(str_V);
        return str_V;
    }


}