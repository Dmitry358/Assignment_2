////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////

////////////////////   V-20   ////////////////////

package it.unipd.mtss;

import java.lang.String;

public class IntegerToRoman{

    protected static String stampaDaUnoATre(int number){
        String result = "";
        for(int i = 1; i <= number; i++){
            result += "I";
        }
        return  result;
    }

    protected static String stampaDaSeiAOtto(int number){
        String result = "V";
        for(int i = 1; i <= number-5; i++){
            result += "I";
        }
        return  result;
    }

    protected static String numUni(int number){
        String result = "";

        if(number>=1 && number <=3){
            result = stampaDaUnoATre(number);
        }

        else if(number == 4) { result = "IV"; }
        else if(number == 5) { result = "V"; }

        else if(number>=6 && number <=8){
            result = stampaDaSeiAOtto(number);
        }

        else if(number == 9) { result = "IX"; }

        return result.isEmpty() ? null : result;
    }

    public static String convert(int number) {
        if(number > 20 || number < 1) { return null; }
        String result = "";

       // 20 >= num_dec >= 1
       for (int i = 1; i <= number / 10; i++) { result += "X"; }

       String uni = numUni(number % 10);

       if(uni != null) { result+=uni; }

       return result.isEmpty() ? null : result;
    }

}


