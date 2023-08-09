import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathTest {
    public static final double EPSILON = 0.01;

    @Test
    public void testPosRaisedToPos() {
                  
        assertEquals(8,MathUtils.power(2,3), EPSILON); //2^3 = 8
    }

    @Test
    public void testPosRaisedToZer() {
                  
        assertEquals(1,MathUtils.power(2,0), EPSILON); 
    }
    @Test
    public void testZeroRaisedToPos() {
                  
        assertEquals(0,MathUtils.power(0,3), EPSILON); 
    }
    @Test
    public void testOneRaisedToPos() {
                  
        assertEquals(1,MathUtils.power(1,1234), EPSILON); 
    }
    @Test
    public void testZeroRaisedToZero() {
                  
        assertEquals(1,MathUtils.power(0,0), EPSILON); 
    }

    @Test
    public void testPosRaisedToNeg() {
                  
        assertEquals(0.25,MathUtils.power(2,-2), EPSILON); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroRaisedToNeg() {
                  
        MathUtils.power(0,-2);
    }
    
}