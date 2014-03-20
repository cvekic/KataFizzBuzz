/**
 * Created by Mladjan on 20.3.2014.
 */
public class FizzBuzz {
    public String stringTest() {
        return "testniString";
    }

    public String searchCorrectWord(int i) {
        if(i % 15 == 0) {
            return "FizzBuzz";
        }
        if(i % 3 == 0) {
            return "Fizz";
        }
        if(i % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(i);
    }
}
