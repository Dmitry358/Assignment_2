////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////


////////////////////   V-3   ////////////////////


package it.unipd.mtss;

import static it.unipd.mtss.IntegerToRoman.convert;
import static it.unipd.mtss.RomanPrinter.print;
import static it.unipd.mtss.RomanPrinter.printAsciiArt;
import static it.unipd.mtss.RomanPrinter.print_I;

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

    @Test // ???? INCLUDERE NEL "testPrintAsciiArt_conCaratteriNonAmmessi"
    public void testPrintAsciiArt_Con_i_Minuscolo(){
        String romanNumber = "i";
        String expected = null ;

        String result = printAsciiArt(romanNumber);

        assertTrue(expected == result);
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testPrintAsciiArt_ConCaratteriNonAmmessi(){
        String alfabeto = "ABCDEFGHJKLMNOPQRSTUVWXYZabcdefghjklmnopqrstuvwxyz";
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

//----------------------- testPrintAsciiArt END -------------------
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
    public void testPrint_ConInputMilleUno(){
        int number  = 1001;
        String expected = null ;

        String result = print(number);

        assertTrue(expected == result);
    }

//------------- testPrint END ----------------

}