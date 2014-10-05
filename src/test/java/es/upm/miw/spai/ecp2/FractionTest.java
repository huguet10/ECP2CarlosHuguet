package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    private Fraction fraction;

    @Before
    public void before() {
        fraction = new Fraction(7, 3);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(7, fraction.getNumerator());
        assertEquals(3, fraction.getDenominator());
    }

    @Test
    public void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(2.333333333d, fraction.decimal(), 10e-5);
    }

}
