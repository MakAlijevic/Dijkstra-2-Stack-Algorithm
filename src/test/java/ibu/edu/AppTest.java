package ibu.edu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Order;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class AppTest 
{
    private Stack<Integer> valueStack = new Stack<Integer>();

    @BeforeEach
    public void setUp() throws Exception {
        valueStack = new Stack<Integer>();
    }

    @AfterEach
    public void tearDown() throws Exception {
        valueStack = null;
    }

    @Test
    @Order(1)
    public void testEmptyStack() {
        assertTrue(valueStack.isEmpty());
    }

    @Test
    @Order(2)
    public void testPopEmptyStack() {
        assertThrows(IndexOutOfBoundsException.class, () -> valueStack.pop());
    }

    @Test
    @Order(3)
    public void testPush() {
        valueStack.push(3);
        valueStack.push(7);
        valueStack.push(9);

        assertFalse(valueStack.isEmpty());
        assertEquals(3, valueStack.size());
    }

    @Test
    @Order(4)
    public void testPop() {
        valueStack.push(1);
        valueStack.push(8);

        assertEquals(8, valueStack.pop());
        assertEquals(1, valueStack.pop());
    }

    @Test
    @Order(5)
    public void testPushPop() {
        valueStack.push(6);
        valueStack.push(9);
        valueStack.push(1);
        valueStack.push(8);

        assertEquals(4, valueStack.size());

        assertEquals(8, valueStack.pop());
        assertEquals(1, valueStack.pop());
        assertEquals(9, valueStack.pop());
        assertEquals(6, valueStack.pop());

        assertEquals(0, valueStack.size());     // Test if stack is empty after pops
    }
}
