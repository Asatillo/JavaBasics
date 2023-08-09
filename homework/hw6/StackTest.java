import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
// import static org.junit.jupiter.api.Assertions.*;

public class StackTest{
    @Test
    public void test_stack(){
        Stack stack = new Stack();
        // a freshly constructed stack is empty
        assertEquals(true, stack.empty());

        // the size() method works properly in corner cases (0, 1);
        assertEquals(0, stack.size());

        // it is not possible to pop from an empty stack (i.e. whether the exception is thrown
        // couldn't just return null because of the error at the next line
        // incompatible types: null cannot be converted to int
        // but it throws an exception and returns -9999 is empty
        assertEquals(-9999, stack.pop());

        // a stack containing one element is not empty
        int num_check = 32;
        stack.push(num_check);
        assertNotEquals(true, stack.empty());

        // the size() method works properly in corner cases (0, 1);
        assertEquals(1, stack.size());

        //the element pushed last is the one which is popped first
        assertEquals(num_check, stack.pop());

        //if the last element is popped, the stack becomes empty
        assertEquals(true, stack.empty());
    }
}