import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorParameterizedTest {
    private int x;
    private int y;
    private int sum;
    private int dif;

    public CalculatorParameterizedTest(int x, int y, int sum, int dif) {
        this.x = x;
        this.y = y;
        this.sum = sum;
        this.dif = dif;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Integer[][]{{1,2,3,-1},{4,4,8,0},{10,9,19,1}});
    }

    @Test
    public void addTest(){
        //given
        Calculator c = new Calculator();
        //when
        int result = c.add(x,y);
        //then
        Assert.assertEquals(sum,result);
    }

    @Test
    public void subTest(){
        //given
        Calculator c = new Calculator();
        //when
        int result = c.sub(x,y);
        //then
        Assert.assertEquals(dif,result);
    }
}

