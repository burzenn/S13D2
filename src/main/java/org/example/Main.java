package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {

    number = Math.abs(number);

    String strNumber = Integer.toString(number);
    StringBuilder reNumber = new StringBuilder(strNumber);
    String reverseNum = reNumber.reverse().toString();

    return strNumber.equals(reverseNum);

    }

    public static boolean isPerfectNumber(int number) {

        if (number <= 0) {
            return false;
        }

        int sumNum = 0;
        for (int i=1 ; i <= number /2 ; i++) {
            if (number % i == 0) {
                sumNum += i ;
            }
        }

        return number == sumNum;

    }


    public static String numberToWords(int number) {

        if (number < 0)
            return "Invalid Value";

        char[] digits =  String.valueof(number).toCharArray();
        String text = "";

        for (char digit : digits) {
            switch (digit) {
                case '0':
                    text += "Zero ";
                    break;
                case '1':
                    text += "One ";
                    break;
                case '2':
                    text += "Two ";
                    break;
                case '3':
                    text += "Three ";
                    break;
                case '4':
                    text += "Four ";
                    break;
                case '5':
                    text += "Five ";
                    break;
                case '6':
                    text += "Six ";
                    break;
                case '7':
                    text += "Seven ";
                    break;
                case '8':
                    text += "Eight ";
                    break;
                case '9':
                    text += "Nine ";
                    break;
            }
        }

        return text.trim();






    }



}
