import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class PostfixStachTest {
    private MyStach<Integer> stack = new MyStach<>();
    @Test
    public void testPushandTop() {
        stack.push(1);
        int result = stack.top();
        assertEquals("Top despues de push deberia ser 1", 1, result);
    }

    @Test
    public void testPop() {
        stack.push(2);
        int result = stack.pop();
        assertEquals("Pop debería retornar el último elemento insertado", 2, result);
    }

    @Test
    public void testIsEmpty() {
        assertTrue("Stack debería estar vacío al inicio", stack.isEmpty());
        stack.push(3);
        assertFalse("Stack no debería estar vacío después de insertar un elemento", stack.isEmpty());
    }

}
