////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////

////////////////////   V-10   ////////////////////

package it.unipd.mtss;

import java.lang.String;

public class IntegerToRoman{

    public static String convert(int number){
        String result = null;
        if(number == 1) { result = "I"; }
        else if(number == 2) { result = "II"; }
        else if(number == 3) { result = "III"; }
        else if(number == 4) { result = "IV"; }
        else if(number == 5) { result = "V"; }
        else if(number == 6) { result = "VI"; }
        else if(number == 7) { result = "VII"; }
        else if(number == 8) { result = "VIII"; }
        else if(number == 9) { result = "IX"; }
        else if(number == 10) { result = "X"; }

        return result;
    }


}
