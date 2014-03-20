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

    public String[] generate(int start, int stop) {
        String[] generate = new String[stop - start + 1];
        int index = 0;
        for (int i = start; i <= stop; i++) {
            if(i % 15 == 0) {
                generate[index] = "FizzBuzz";
                index++;
                continue;
            }
            if(i % 3 == 0) {
                generate[index] = "Fizz";
                index++;
                continue;
            }
            if(i % 5 == 0) {
                generate[index] = "Buzz";
                index++;
                continue;
            }
            generate[index] = String.valueOf(i);
            index++;
        }
        return generate;
    }
}
