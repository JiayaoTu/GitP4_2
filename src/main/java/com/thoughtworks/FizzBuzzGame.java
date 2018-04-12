package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    private int num1=3, num2=5, num3=7;

    public void start(int count) {
        for (int n = 1; n <= count; n++) {
            String s=String.valueOf(n);
            if(!Return_Fizz_when_have_3(n).equals(s))
            {
                results.add(Return_Fizz_when_have_3(n));
              //  continue;
            }else if(!Return_FizzBuzzWhizz_when_have_357(n).equals(s))
            {
                results.add(Return_FizzBuzzWhizz_when_have_357(n));
                //continue;

            }else if(!Return_TwoOf_FizzBuzzWhizz_when_have_TwoOf_357(n).equals(s))
            {
                results.add(Return_TwoOf_FizzBuzzWhizz_when_have_TwoOf_357(n));
               // continue;


            }else if(!Return_OneOf_FizzBuzzWhizz_when_have_OneOf_357(n).equals(s))
            {
                System.out.println(Return_OneOf_FizzBuzzWhizz_when_have_OneOf_357(n));

                results.add(Return_OneOf_FizzBuzzWhizz_when_have_OneOf_357(n));
              //  continue;

            }else{
                results.add(s);
            }


        }
    }


    public String Return_Fizz_when_have_3(int n)
    {
        String str="Fizz";
        if(String.valueOf(n).indexOf(num1 + 48) != -1)
        {
            return str;
        }else{
            return String.valueOf(n);
        }
    }

    public String Return_FizzBuzzWhizz_when_have_357(int n)
    {
        String str="FizzBuzzWhizz";
        if(n % num1 == 0 && n % num2 == 0 && n % num3 == 0)
        {
            return str;
        }else{
            return String.valueOf(n);
        }
    }

    public String Return_TwoOf_FizzBuzzWhizz_when_have_TwoOf_357(int n)
    {
        String str12="FizzBuzz";
        String str13="FizzWhizz";
        String str23="BuzzWhizz";
        if(n % num1 == 0 && n % num2 == 0)
        {
            return str12;
        } else if(n % num2 == 0 && n % num3 == 0){
            return str23;
        }else if(n % num1 == 0 && n % num3 == 0){
            return str13;
        }else{
            return String.valueOf(n);
        }
    }
    public String Return_OneOf_FizzBuzzWhizz_when_have_OneOf_357(int n)
    {
        String str1="Fizz";
        String str2="Buzz";
        String str3="Whizz";
        if(n % num1 == 0 )
        {
            return str1;

        } else if(n % num2 == 0 ){
            return str2;
        }else if(n % num3 == 0 ){
            return str3;
        }else{
            return String.valueOf(n);
        }
    }




    public List<String> getResults() {
        return results;
    }
}


