package com.thoughtworks;

import org.junit.Test;
import java.util.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class FizzBuzzGameTest {


    @Test
    public void should_return_Fizz_when_have_3() {
        int n1=13;

        FizzBuzzGame game=new FizzBuzzGame();
        assertThat(game.Return_Fizz_when_have_3(n1),is("Fizz"));

//
    }


    @Test
    public void should_Return_FizzBuzzWhizz_when_have_357()
    {
        int n1=105;

        FizzBuzzGame game=new FizzBuzzGame();
        assertThat(game.Return_FizzBuzzWhizz_when_have_357(n1),is("FizzBuzzWhizz"));
    }

    @Test
    public void should_Return_TwoOf_FizzBuzzWhizz_when_have_TwoOf_357()

    {
        int n1=15;
        int n2=21;
        int n3=35;
        FizzBuzzGame game=new FizzBuzzGame();
        assertThat(game.Return_TwoOf_FizzBuzzWhizz_when_have_TwoOf_357(n1),is("FizzBuzz"));
        assertThat(game.Return_TwoOf_FizzBuzzWhizz_when_have_TwoOf_357(n2),is("FizzWhizz"));
        assertThat(game.Return_TwoOf_FizzBuzzWhizz_when_have_TwoOf_357(n3),is("BuzzWhizz"));

    }

    @Test
    public void should_Return_OneOf_FizzBuzzWhizz_when_have_OneOf_357()
    {
        //int n1=9;
        int n2=5;
        //int n3=28;
        FizzBuzzGame game=new FizzBuzzGame();
       // assertThat(game.Return_OneOf_FizzBuzzWhizz_when_have_OneOf_357(n1),is("Fizz"));
        assertThat(game.Return_OneOf_FizzBuzzWhizz_when_have_OneOf_357(n2),is("Buzz"));
       // assertThat(game.Return_OneOf_FizzBuzzWhizz_when_have_OneOf_357(n3),is("Whizz"));
    }



    @Test
    public void should_return_Results() {
       int n1=11;
        int n2=4;
        String []str1={"1","2","Fizz","4","Buzz","Fizz","Whizz","8","Fizz","Buzz","11"};
        String []str2={"1","2","Fizz","4"};
        List<String> res=Arrays.asList(str1);
        String sss=res.toString();
        FizzBuzzGame game=new FizzBuzzGame();
        game.start(n1);
        String ss=game.getResults().toString();
        assertThat(ss,is(sss));
        //assertThat(game.getResults,is("Fizz"));

    }
}
