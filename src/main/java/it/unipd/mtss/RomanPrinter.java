////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////

////////////////////   V-10   ////////////////////

package it.unipd.mtss;

public class RomanPrinter {

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

    protected static String print_X() {
        String str_X = "__    __\n"+
                "\\ \\  / /\n"+
                " \\ \\/ /\n"+
                "  > <\n"+
                " / . \\\n"+
                "/_/ \\_\\\n";

        System.out.println(str_X);
        return str_X;
    }

    protected static boolean isStrangeInput(String romanNumber) {
        boolean correctInput = true;
        if(romanNumber == null) { correctInput = false; }

        else if(romanNumber == " ") { correctInput = false; }

        else if(romanNumber.length() < 1 || romanNumber.length() > 4) {
            correctInput = false;
        }

        return correctInput;
    }

    protected static boolean isInputCorrect(String romanNumber) {
        boolean correctInput = true;

        if(!isStrangeInput(romanNumber)){correctInput = false;}

        else if(romanNumber.length() > 1 && romanNumber.charAt(0) == 'X') {
            correctInput = false;
        }

        else if(romanNumber.length() > 2 && romanNumber.charAt(1) == 'X') {
            correctInput = false;
        }

        for (int i = 0; correctInput && i < romanNumber.length(); i++){
            char aux = romanNumber.charAt(i);
            if( aux != 'I' && aux != 'V' && aux != 'X') {correctInput = false;}
        }

        return correctInput;
    }

    protected static String printAsciiArt(String romanNumber) {
        String stringaAscii = "";
        boolean correctInput = isInputCorrect(romanNumber);

        if(correctInput) {
            for (int i = 0; i < romanNumber.length(); i++) {
                char aux = romanNumber.charAt(i);
                if(aux == 'I'){ stringaAscii += print_I(); }
                else if(aux == 'V') { stringaAscii += print_V(); }
                else if(aux == 'X') { stringaAscii += print_X(); }
            }
        }

        return correctInput ? stringaAscii : null;
    }

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }


}