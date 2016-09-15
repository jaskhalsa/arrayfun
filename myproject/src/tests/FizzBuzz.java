package tests;

/**
 * Created by jkhalsa on 06/09/2016.
 */
public class FizzBuzz {
    public String FizzBuzzer(int i) {
        String numberString = "" + i;

        if(i % 3 == 0 && i % 5 == 0)
            return "FizzBuzz";
        else if(i % 3 == 0 || numberString.contains("3"))
            return "Fizz";
        else if(i % 5 == 0 || numberString.contains("5"))
            return "Buzz";
        return numberString;
    }
}
