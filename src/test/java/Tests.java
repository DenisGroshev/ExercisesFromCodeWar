import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void testOfNumber(){
        Assertions.assertEquals("(123) 456-7890", Kata.createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0}));
    }
}
