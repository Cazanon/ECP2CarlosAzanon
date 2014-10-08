package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
    
    private DecimalCollection collection;

    @Before
    public void before() { 
        collection = new DecimalCollection();
        collection.add(8.5);
        collection.add(8.8);
    }
    
    @Test 
    public void testSize() { 
        assertEquals(2, collection.size());  
    } 

    @Test 
    public void testHigher() { 
        assertEquals(8.8, collection.higher(), 0.1);
    } 

    @Test 
    public void testSum() { 
        assertEquals(17.3, collection.sum(), 0.1);
    } 
   
    @Test
    public void testMultiply(){
    	assertEquals(74.8, collection.multiply(), 0.1);
    }
}