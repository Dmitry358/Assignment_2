////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////


////////////////////   V-6   ////////////////////


package it.unipd.mtss;

import static it.unipd.mtss.IntegerToRoman.convert;
import static it.unipd.mtss.RomanPrinter.print;
import static it.unipd.mtss.RomanPrinter.printAsciiArt;
import static it.unipd.mtss.RomanPrinter.print_I;
import static it.unipd.mtss.RomanPrinter.print_V;
import static it.unipd.mtss.RomanPrinter.isInputCorrect;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class RomanPrinterTest {
    //come testare STAMPA IN CONSOLE di "print_I" e "PrintAsciiArt"
    //!!!!! TEST COSTRUTTORE???
    //romannumber == null
    //romannumber == ""
    //romannumber != I,V,X,L,C,D,M
    //test minusculi I,V,X,L,C,D,M
    // carattere SPAZIO
    //STAMPA DIVERSE COMBINAZIONI DI LETTERE: SOLO GIUSTE E GIUSTE CON SBAGLIATE
    //TUTTI TEST DI "PrintAscciArt" ANCHE PER "String print(int num)"


//------------- testPrintAsciiArt BEGIN ----------------

    @Test
    public void testPrintAsciiArt_ConStringaNulla(){
        String romanNumber = null;
        String expected = null;

        String result = printAsciiArt(romanNumber);

        assertTrue(expected == result);
    }

    @Test
    public void testPrintAsciiArt_ConStringaVuota(){
        String romanNumber = "";
        String expected = null ;

        String result = printAsciiArt(romanNumber);

        assertTrue(expected == result);
    }

    @Test
    public void testPrintAsciiArt_ConSpazio(){
        String romanNumber = " ";
        String expected = null ;

        String result = printAsciiArt(romanNumber);

        assertTrue(expected == result);
    }

    @Test
    public void testPrintAsciiArt_ConStringaConSpazio(){
        String romanNumber = "II I ";
        String expected = null ;

        String result = printAsciiArt(romanNumber);

        assertTrue(expected == result);
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testPrintAsciiArt_ConCaratteriNonAmmessi(){
        String alfabeto = "ABCDEFGHJKLMNOPQRSTUWXYZabcdefghjiklmnopqrstuvwxyz";
        String expected = null;
        boolean fail = false;

        for(int i = 0; !fail && i < alfabeto.length(); i++){
            String result = printAsciiArt(String.valueOf(alfabeto.charAt(i)));
            if(expected != result){ fail = true; }
        }

        assertTrue(!fail);
    }

    @Test
    public void testPrintAsciiArt_Con_I(){
        String romanNumber = "I";
        String expected = " _____\n"+
                          "|_   _|\n"+
                          "  | |\n"+
                          "  | |\n"+
                          " _| |_\n"+
                          "|_____|\n";

        String result = printAsciiArt(romanNumber);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testPrintAsciiArt_Con_II(){
        String romanNumber = "II";
        String expected = " _____\n"+
                          "|_   _|\n"+
                          "  | |\n"+
                          "  | |\n"+
                          " _| |_\n"+
                          "|_____|\n"+
                          " _____\n"+
                          "|_   _|\n"+
                          "  | |\n"+
                          "  | |\n"+
                          " _| |_\n"+
                          "|_____|\n";

        String result = printAsciiArt(romanNumber);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testPrintAsciiArt_Con_III(){
        String romanNumber = "III";
        String expected = " _____\n"+
                          "|_   _|\n"+
                          "  | |\n"+
                          "  | |\n"+
                          " _| |_\n"+
                          "|_____|\n"+
                          " _____\n"+
                          "|_   _|\n"+
                          "  | |\n"+
                          "  | |\n"+
                          " _| |_\n"+
                          "|_____|\n"+
                          " _____\n"+
                          "|_   _|\n"+
                          "  | |\n"+
                          "  | |\n"+
                          " _| |_\n"+
                          "|_____|\n";

        String result = printAsciiArt(romanNumber);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testPrintAsciiArt_Con_IV(){
        String romanNumber = "IV";
        String expected = " _____\n"+
                "|_   _|\n"+
                "  | |\n"+
                "  | |\n"+
                " _| |_\n"+
                "|_____|\n"+
                "__      __\n"+
                "\\ \\    / /\n"+
                " \\ \\  / /\n"+
                "  \\ \\/ /\n"+
                "   \\  /\n"+
                "    \\/\n";

        String result = printAsciiArt(romanNumber);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testPrintAsciiArt_Con_V(){
        String romanNumber = "V";
        String expected = "__      __\n"+
                "\\ \\    / /\n"+
                " \\ \\  / /\n"+
                "  \\ \\/ /\n"+
                "   \\  /\n"+
                "    \\/\n";

        String result = printAsciiArt(romanNumber);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testPrintAsciiArt_Con_VI(){
        String romanNumber = "VI";
        String expected ="__      __\n"+
                "\\ \\    / /\n"+
                " \\ \\  / /\n"+
                "  \\ \\/ /\n"+
                "   \\  /\n"+
                "    \\/\n"+
                " _____\n"+
                "|_   _|\n"+
                "  | |\n"+
                "  | |\n"+
                " _| |_\n"+
                "|_____|\n";

        String result = printAsciiArt(romanNumber);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testPrintAsciiArt_Con_VII(){
        String romanNumber = "VII";
        String expected = null;

        String result = printAsciiArt(romanNumber);

        assertTrue(expected == result);
    }

//--------------------- testPrintAsciiArt END -------------------

//--------------------- isInputCorrect BEGIN ---------
    @Test
    public void testisInputCorrect_ConStringaNulla(){
        String romanNumber = null;
        boolean expected = false;

        boolean result = isInputCorrect(romanNumber);

        assertTrue(expected == result);
    }

    @Test
    public void testisInputCorrect_ConStringaVuota(){
        String romanNumber = "";
        boolean expected = false;

        boolean result = isInputCorrect(romanNumber);

        assertTrue(expected == result);
    }

    @Test
    public void testisInputCorrect_ConSpazio(){
        String romanNumber = " ";
        boolean expected = false;

        boolean result = isInputCorrect(romanNumber);

        assertTrue(expected == result);
    }

    @Test
    public void testisInputCorrect_ConStringaConSpazio(){
        String romanNumber = "I I";
        boolean expected = false;

        boolean result = isInputCorrect(romanNumber);

        assertTrue(expected == result);
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testisInputCorrect_ConCaratteriNonAmmessi(){
        String alfabeto = "ABCDEFGHJKLMNOPQRSTUWXYZabcdefghjiklmnopqrstuvwxyz";
        boolean expected = false;
        boolean fail = false;

        for(int i = 0; !fail && i < alfabeto.length(); i++){
            boolean result = isInputCorrect(String.valueOf(alfabeto.charAt(i)));
            if(expected != result){ fail = true; }
        }

        assertTrue(!fail);
    }

    @Test
    public void testisInputCorrect_Con_I(){
        String romanNumber = "I";
        boolean expected = true;

        boolean result = isInputCorrect(romanNumber);

        assertTrue(expected == result);
    }

    @Test
    public void testisInputCorrect_Con_II(){
        String romanNumber = "II";
        boolean expected = true;

        boolean result = isInputCorrect(romanNumber);

        assertTrue(expected == result);
    }

    @Test
    public void testisInputCorrect_Con_III(){
        String romanNumber = "III";
        boolean expected = true;

        boolean result = isInputCorrect(romanNumber);

        assertTrue(expected == result);
    }

    @Test
    public void testisInputCorrect_Con_IV(){
        String romanNumber = "IV";
        boolean expected = true;

        boolean result = isInputCorrect(romanNumber);

        assertTrue(expected == result);
    }

    @Test
    public void testisInputCorrect_Con_V(){
        String romanNumber = "V";
        boolean expected = true;

        boolean result = isInputCorrect(romanNumber);

        assertTrue(expected == result);
    }

    @Test
    public void testisInputCorrect_Con_VI(){
        String romanNumber = "VI";
        boolean expected = true;

        boolean result = isInputCorrect(romanNumber);

        assertTrue(expected == result);
    }

    @Test
    public void testisInputCorrect_Con_VII(){
        String romanNumber = "VII";
        boolean expected = false;

        boolean result = isInputCorrect(romanNumber);

        assertTrue(expected == result);
    }


//------------- isInputCorrect END   ---------

//----------------------- testPrint BEGIN ------------------------

    @Test //?????? DA SOSTITUIRE "assertTrue"
    //!!!!!!!!!!!!!!! DA REALIZZARE !!!!!!!!!!!!!!!!!!!!!!!
    public void testPrint_ConInputLettera(){
        String expected = null;
        char lettera = 'a';
        boolean correct = true;

        String result = convert(lettera);
        if(expected != result) { correct = false;}

        assertTrue(correct);
    }

    @Test
    public void testPrint_ConInputMenoCinquanta(){
        int number  = -50;
        String expected = null ;

        String result = print(number);

        assertTrue(expected == result);
    }
    @Test
    public void testPrint_ConInputZero(){
        int number  = 0;
        String expected = null ;

        String result = print(number);

        assertTrue(expected == result);
    }

    @Test
    public void testPrint_ConInputUno(){
        int number  = 1;
        String expected = " _____\n"+
                "|_   _|\n"+
                "  | |\n"+
                "  | |\n"+
                " _| |_\n"+
                "|_____|\n";

        String result = print(number);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testPrint_ConInputDue(){
        int number  = 2;
        String expected = " _____\n"+
                "|_   _|\n"+
                "  | |\n"+
                "  | |\n"+
                " _| |_\n"+
                "|_____|\n"+
                " _____\n"+
                "|_   _|\n"+
                "  | |\n"+
                "  | |\n"+
                " _| |_\n"+
                "|_____|\n";

        String result = print(number);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testPrint_ConInputTre(){
        int number  = 3;
        String expected = " _____\n"+
                "|_   _|\n"+
                "  | |\n"+
                "  | |\n"+
                " _| |_\n"+
                "|_____|\n"+
                " _____\n"+
                "|_   _|\n"+
                "  | |\n"+
                "  | |\n"+
                " _| |_\n"+
                "|_____|\n"+
                " _____\n"+
                "|_   _|\n"+
                "  | |\n"+
                "  | |\n"+
                " _| |_\n"+
                "|_____|\n";

        String result = print(number);

        assertTrue(expected.equals(result));
    }


    @Test
    public void testPrint_ConQuattro(){
        int romanNumber = 4;
        String expected = " _____\n"+
                "|_   _|\n"+
                "  | |\n"+
                "  | |\n"+
                " _| |_\n"+
                "|_____|\n"+
                "__      __\n"+
                "\\ \\    / /\n"+
                " \\ \\  / /\n"+
                "  \\ \\/ /\n"+
                "   \\  /\n"+
                "    \\/\n";

        String result = print(romanNumber);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testPrint_ConCinque(){
        int romanNumber = 5;
        String expected = "__      __\n"+
                "\\ \\    / /\n"+
                " \\ \\  / /\n"+
                "  \\ \\/ /\n"+
                "   \\  /\n"+
                "    \\/\n";

        String result = print(romanNumber);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testPrint_ConSei(){
        int romanNumber = 6;
        String expected ="__      __\n"+
                "\\ \\    / /\n"+
                " \\ \\  / /\n"+
                "  \\ \\/ /\n"+
                "   \\  /\n"+
                "    \\/\n"+
                " _____\n"+
                "|_   _|\n"+
                "  | |\n"+
                "  | |\n"+
                " _| |_\n"+
                "|_____|\n";

        String result = print(romanNumber);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testPrint_ConSette(){
        int romanNumber = 7;
        String expected = null;

        String result = print(romanNumber);

        assertTrue(expected == result);
    }

    @Test
    public void testPrint_ConInputMilleUno(){
        int number  = 1001;
        String expected = null ;

        String result = print(number);

        assertTrue(expected == result);
    }

//------------- testPrint END ----------------

//------------- testPrint_I e testPrint_V  BEGIN  ----------
    @Test
    public void testPrint_I(){
        String expected = " _____\n"+
                "|_   _|\n"+
                "  | |\n"+
                "  | |\n"+
                " _| |_\n"+
                "|_____|\n";

        String result = print_I();

        assertTrue(expected.equals(result));
    }

    @Test
    public void testPrint_V(){
        String expected = "__      __\n"+
                "\\ \\    / /\n"+
                " \\ \\  / /\n"+
                "  \\ \\/ /\n"+
                "   \\  /\n"+
                "    \\/\n";

        String result = print_V();

        assertTrue(expected.equals(result));
    }

//------------- testPrint_I e testPrint_V  END  ----------



}