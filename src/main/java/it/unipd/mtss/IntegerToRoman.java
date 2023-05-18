////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////

////////////////////   V-6   ////////////////////

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
        return result;
    }


}
