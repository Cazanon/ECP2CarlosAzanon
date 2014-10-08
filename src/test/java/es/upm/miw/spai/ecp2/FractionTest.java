package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    private Fraction fraction;

    @Before 
    public void before() { 
        fraction = new Fraction(7, 2); 
    } 

    @Test 
    public void testFractionIntInt() { 
        assertEquals(7, fraction.getNumerator()); 
        assertEquals(2, fraction.getDenominator()); 
    } 

    @Test
    public void testDecimal() {
        assertEquals(3.5, fraction.decimal(), 0.01);
    }

    @Test
    public void testIsEquivalente() {
    	Fraction f = new Fraction(8,2);
    	Fraction f2 = new Fraction(14,4);
        assertEquals(false, fraction.isEquivalente(f));
        assertEquals(true, fraction.isEquivalente(f2));
    }
    
    @Test
    public void testIsPropia(){
    	assertEquals(true,fraction.isPropia());
    }
    
    @Test
    public void testMultiply(){
    	assertEquals(new Fraction(28,14),fraction.multiply(new Fraction(4,7)));
    }
    
}
