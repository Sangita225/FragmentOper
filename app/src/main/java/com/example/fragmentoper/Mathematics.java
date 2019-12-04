package com.example.fragmentoper;

public class Mathematics {

    private  int first,second;


public  Mathematics(int first, int second){
    this.first=first;
    this.second=second;

}

public  int add(){
    int a=first+second;
    return a;
}


public  static  float area(float radius){
    return (22/7*radius*radius);
}


    public static int reverseNumber(int number){
        int reverse = 0;
        while(number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }


    public static boolean isPalindrome(int integer) {
        int palindrome = integer;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if(integer==reverse) return true;
        else return false;
    }

    public static boolean isAutomorphic(int integer) {
        int automorphic = integer;
        int square = automorphic * automorphic;

        String inputAutomorphic = automorphic + "";
        String squareAutomorphic = square + "";

        if(squareAutomorphic.endsWith(inputAutomorphic))
            return true;
        else
            return false;
    }

    public static String reverseString(String value){

        StringBuilder sb = new StringBuilder(value);
        String result = sb.reverse().toString();
        return result;
    }


























}
