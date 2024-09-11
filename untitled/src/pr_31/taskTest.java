package pr_31;

import org.junit.Test;
import static org.junit.Assert.*;

public class taskTest {

    @Test
    public void testIsEvenNumber() {
        assertFalse(task.isEvenNumber(5));
        assertFalse(task.isEvenNumber(3));
        assertTrue(task.isEvenNumber(42));
        assertTrue(task.isEvenNumber(16));
        assertTrue(task.isEvenNumber(0));
    }
    @Test
    public void testIsEvenNumberZero() {
        assertTrue(task.isEvenNumber(0));
    }

    @Test
    public void testIsEvenNumberNegative() {
        assertFalse(task.isEvenNumber(-5));
        assertFalse(task.isEvenNumber(-3));
        assertTrue(task.isEvenNumber(-42));
        assertTrue(task.isEvenNumber(-16));
    }

    @Test
    public void testIsSimpleNumber(){
        assertFalse(task.isSimpleNumber(16, 2));
        assertTrue(task.isSimpleNumber(7, 2));
        assertFalse(task.isSimpleNumber(91, 2));
    }
}
