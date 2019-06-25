import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest(){
        //given
        Calculator c = new Calculator();
        //when
        int result = c.add(3,4);
        //then
        Assert.assertEquals(7,result);
    }
}
