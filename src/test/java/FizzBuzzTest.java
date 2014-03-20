import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mladjan on 20.3.2014.
 */
public class FizzBuzzTest {

    FizzBuzz subject;

    @Before
    public void setUp(){
        subject = new FizzBuzz();
    }


    @Test
    public void testString(){
        assertEquals("testniString", subject.stringTest());
    }

    @Test
    public void returnOne(){
        assertEquals("1", subject.searchCorrectWord(1));
    }

    @Test
    public void returnFizz(){
        assertEquals("Fizz", subject.searchCorrectWord(3));
    }

    @Test
    public void returnBuzz(){
        assertEquals("Buzz", subject.searchCorrectWord(5));
    }


    @Test
    public void returnFizzBuzz(){
        assertEquals("FizzBuzz", subject.searchCorrectWord(15));
    }

    @Test
    public void returnSixteen(){
        assertEquals("16", subject.searchCorrectWord(16));
    }

   


}
