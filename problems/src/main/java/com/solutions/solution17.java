package com.solutions;

public class solution17 {
    static int totalNum1 = 0;
    static int totalNum2 = 0;
    static int totalNum3 = 0;
    static int totalNum4 = 0;

    public static void main(String[] args) {
        long sumOfLengths = 0;
        for (int i = 1; i <= 1000; i++) {
            sumOfLengths += lengthOfNum(i);
        }
        System.out.println(sumOfLengths);
        System.out.println("Sum of 1 digit numbers: " + totalNum1 + " , sum of 2 digits numbers: " + totalNum2 + ", sum of 3 digit number: " + totalNum3);
    }

    public static int lengthOfNum(int num) {
        int yehidot = 0, asarot = 0, meot = 0;
        String number = "";
        char[] nums = (num + "").toCharArray();
        if (nums.length == 1) {
            yehidot = num % 10;
            number += (numToWord(String.valueOf(num)));
            System.out.println(num + "=" + numToWord(String.valueOf(num)));
            totalNum1 += number.length();

        } else if (nums.length == 2) {
            if (!(num < 20 && num > 10)) {
                asarot = num / 10;
                yehidot = num % 10;
                number += (numToWord(String.valueOf(asarot * 10)));
                number += numToWord(String.valueOf(yehidot));
                totalNum2 += number.length();
            } else {
                number += numToWord(String.valueOf(num));
                totalNum2 += number.length();
            }
        } else if (nums.length == 3) {
            meot = num / 100;
            asarot = (num % 100) / 10;
            yehidot = num % 10;
            int asarotYehidot = asarot * 10 + yehidot;
            if (!(asarotYehidot < 20 && asarotYehidot > 10)) {
                number += numToWord(String.valueOf(meot));
                if (num % 100 != 0)
                    number += "hundredand";
                else
                    number += "hundred";
                number += numToWord(String.valueOf(asarot * 10));
                number += numToWord(String.valueOf(yehidot));
                totalNum3 += number.length();
            } else {
                number += numToWord(String.valueOf(meot));
                if (num % 100 != 0)
                    number += "hundredand";
                else
                    number += "hundred";
                number += numToWord(String.valueOf(asarotYehidot));
                totalNum3 += number.length();
            }
        } else if (nums.length == 4) {
            number += "onethousand";
        }
        System.out.println(num + "=" + number + " has a length of " + number.length());
        return number.length();
    }

    public static String numToWord(String num) {
        switch (num) {
            case "0":
                return "";
            case "1":
                return "one";
            case "2":
                return "two";
            case "3":
                return "three";
            case "4":
                return "four";
            case "5":
                return "five";
            case "6":
                return "six";
            case "7":
                return "seven";
            case "8":
                return "eight";
            case "9":
                return "nine";
            case "10":
                return "ten";
            case "11":
                return "eleven";
            case "12":
                return "twelve";
            case "13":
                return "thirteen";
            case "14":
                return "fourteen";
            case "15":
                return "fifteen";
            case "16":
                return "sixteen";
            case "17":
                return "seventeen";
            case "18":
                return "eighteen";
            case "19":
                return "nineteen";
            case "20":
                return "twenty";
            case "30":
                return "thirty";
            case "40":
                return "forty";
            case "50":
                return "fifty";
            case "60":
                return "sixty";
            case "70":
                return "seventy";
            case "80":
                return "eighty";
            case "90":
                return "ninety";
            case "100":
                return "hundred";
        }
        return "ERROR";

    }
}
