package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void testSuma() {
        Fraction fr2 = new Fraction(1, 6);
        Fraction resultado = fraction.suma(fr2);
        assertEquals(45, resultado.getNumerator());
        assertEquals(18, resultado.getDenominator());
    }
    
    @Test
    public void testMenor() {
    	Fraction fr2 = new Fraction(50,5);
    	assertTrue(fraction.menor(fr2));
    }

    @Test
    public void testMayor() {
    	Fraction fr2 = new Fraction(10,5);
    	assertTrue(fraction.mayor(fr2));
    	
    }
    
    @Test
    public void testIsPropia(){
    	assertEquals(false, fraction.isPropia());
    }
    
    @Test
    public void testIsImpropia(){
    	assertEquals(true, fraction.isImpropia());
    }
    
}
