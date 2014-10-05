package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
	
	private DecimalCollection decimalCollection;
	
	@Before
    public void before() {
		decimalCollection = new DecimalCollection();
		decimalCollection.add(5.1d);
		decimalCollection.add(2.2d);
		decimalCollection.add(3.3d);
    }

    @Test
    public void testDecimalCollectionNewSize() {
    	decimalCollection = new DecimalCollection();
    	assertEquals(0, decimalCollection.size());
    }

    @Test
    public void testAddDecimal() {
    	decimalCollection.add(7.0d);
        assertEquals(4, decimalCollection.size());
    }

    @Test
    public void testSum() {
        assertEquals(10.6d, decimalCollection.sum(), 10e-5);
    }
    
    @Test
    public void testHigher() {
        assertEquals(5.1d, decimalCollection.higher(), 10e-5);
    }
    
}
