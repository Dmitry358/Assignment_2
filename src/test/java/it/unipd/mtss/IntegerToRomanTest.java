////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////


////////////////////   V-50 TEST  ////////////////////


package it.unipd.mtss;

import static it.unipd.mtss.IntegerToRoman.convert;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class IntegerToRomanTest{

    @Test //?????? DA SOSTITUIRE "assertTrue"
    //!!!!!!!!!!!!!!! DA REALIZZARE !!!!!!!!!!!!!!!!!!!!!!!
    public void testConvert_ConInputLettera(){
        String expected = null;
        char lettera = 'a';
        boolean correct = true;

        String result = convert(lettera);
        if(expected != result) { correct = false;}

        assertTrue(correct);
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputMenoCinquanta(){
        String expected = null;
        int number = -50;
        boolean correct = true;

        String result = convert(number);
        if(expected != result) { correct = false;}

        assertTrue(correct);
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputZero(){
        String expected = null;
        int number = 0;
        boolean correct = true;

        String result = convert(number);
        if(expected != result) { correct = false;}

        assertTrue(correct);
    }

    @Test
    public void testConvert_ConInputUno(){
        String expected = "I";
        int number = 1;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testConvert_ConInputDue(){
        String expected = "II";
        int number = 2;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testConvert_ConInputTre(){
        String expected = "III";
        int number = 3;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputQuattro(){
        String expected = "IV";
        int number = 4;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputCinque(){
        String expected = "V";
        int number = 5;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }


    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputSei(){
        String expected = "VI";
        int number = 6;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputSette(){
        String expected = "VII";
        int number = 7;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }


    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputOtto(){
        String expected = "VIII";
        int number = 8;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputNove(){
        String expected = "IX";
        int number = 9;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputDieci(){
        String expected = "X";
        int number = 10;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputUndici(){
        String expected = "XI";
        int number = 11;
        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputDicianove(){
        String expected = "XIX";
        int number = 19;
        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputVenti(){
        String expected = "XX";
        int number = 20;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputVentuno(){
        String expected = "XX";
        int number = 20;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputTrentanove(){
        String expected = "XXXIX";
        int number = 39;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputQuaranta(){
        String expected = "XL";
        int number = 40;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputQuarantuno(){
        String expected = "XLI";
        int number = 41;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputQuaranove(){
        String expected = "XLIX";
        int number = 49;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputCinquanta(){
        String expected = "L";
        int number = 50;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputCinquantuno(){
        String expected = null;
        int number = 51;
        boolean correct = true;

        String result = convert(number);
        if(expected != result) { correct = false;}

        assertTrue(correct);
    }


    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputMilleUno(){
        String expected = null;
        int number = 1001;
        boolean correct = true;

        String result = convert(number);
        if(expected != result) { correct = false;}

        assertTrue(correct);
    }


}
