////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////

////////////////////   V-1000   ////////////////////

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

    protected static String numDecine(int number){

        String result = "";

        // 99 >= num >= 90
        if (number / 90 >= 1){
            result += "XC";

            // 9 >= num >= 1
            if (number % 10 > 0) { result += numUni(number % 10); }
        }

        // 89 >= num >= 50
        else if(number/50 >= 1) {
            result += "L";

            for (int i = 1; i <= (number - 50) / 10; i++){
                result += "X";
            }

            // 9 >= num >= 1
            if (number % 10 > 0) { result += numUni(number % 10); }
        }

        // 49 >= num >= 40
        else if (number / 40 >= 1 ) {
            result += "XL";

            // 9 >= num >= 1
            if (number % 10 > 0) { result += numUni(number % 10); }
        }

        // 39 >= num >= 1
        else {
            // 39 >= num >= 10
            for (int i = 1; i <= number / 10; i++) {
                result += "X";
            }

            // 9 >= num >= 1
            if (number % 10 > 0) { result += numUni(number % 10); }
        }

        return result.isEmpty() ? null : result;
    }

    protected static String numCentinaia(int number){
        String result = "";

        // num == 1000
        if(number == 1000) { return "M"; }

        // 999 >= num >= 900
        else if (number / 900 >= 1) {
            result += "CM";

            // 99 >= num >= 1
            if (number % 100 > 0) {
                result += numDecine(number % 100);
            }
        }

        // 899 >= num >= 500
        else if(number / 500 >= 1){
            result += "D";

            for (int i = 1; i <= (number - 500) / 100; i++) { result += "C"; }

            // 9 >= num >= 1
            if (number % 100 > 0) { result += numDecine(number % 100); }
        }

        // 499 >= num >= 400
        else if (number / 400 >= 1) {
            result += "CD";

            // 99 >= num >= 1
            if (number % 100 > 0) {
                result += numDecine(number % 100);
            }
        }

        // 399 >= num >= 1
        else {
            // 399 >= num >= 100
            for (int i = 1; i <= number / 100; i++) { result += "C"; }

            // 9 >= num >= 1
            if (number % 100 > 0) { result += numDecine(number % 100); }
        }

        return result.isEmpty() ? null : result;
    }

    public static String convert(int number) {
        String result = "";

        if(number > 1000 || number < 1) { return null; }

        result += numCentinaia(number);

        return result.isEmpty() ? null : result;
    }

}




