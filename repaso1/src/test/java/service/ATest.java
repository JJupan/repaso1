package service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ATest {
    private A a;
    private B b;

    @Before
    public void setUp() throws Exception {
        b = new B();
        a = new A();
    }

    @Test
    public void testSetAndGetB() {
        a.setB1(b);
        assertEquals(b, a.getB1());
    }

    @Test
    public void testToStringContainsB() {
        a.setB1(b);
        String resultado = a.toString();
        assertTrue(resultado.contains("B{}"));
    }
}
