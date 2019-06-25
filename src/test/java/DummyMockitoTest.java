import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

//pentru exemplificat mockito
public class DummyMockitoTest {

    @Test
    public void test(){
        Calculator calculator = mock(Calculator.class);
        Calculator c2 = spy(new Calculator());

        when(calculator.add(5,6)).thenReturn(10);
        when(c2.sub(5,6)).thenReturn(10);
        int result = c2.sub(3,4);
        Assert.assertEquals(10,c2.sub(5,6));
        Assert.assertEquals(-1,result);
        Assert.assertEquals(10,calculator.add(5,6));

        verify(calculator).add(5,6);
        calculator.add(5,6);
        verify(calculator, times(2)).add(5,6);
        verify(calculator,atLeast(1)).add(5,6);

    }
}
