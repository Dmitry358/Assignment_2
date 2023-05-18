////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////

////////////////////   V-3   ////////////////////

package it.unipd.mtss;

import java.lang.String;

public class IntegerToRoman{

    public static String convert(int number){
        String result = null;
        switch (number){
            case (1): result = "I"; break;
            case (2): result = "II"; break;
            case (3): result = "III"; break;
            default: result = null;
        }
        return result;
   }

}
