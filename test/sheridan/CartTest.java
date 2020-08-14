/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 *
 * @author VINAY
 */
public class CartTest {
    
    public CartTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
  

    @Test
    public void testGetCartSizeGood() {
        System.out.println("getCartSize");
        Cart instance = new Cart();
        instance.addProduct(new Product( "shirt" , 50 ));
        int expResult = 1;
        int result = instance.getCartSize();
        assertEquals(expResult, result);
        
    }
     @Test
    public void testGetCartSizeBad() {
        System.out.println("getCartSize");
        Cart instance = new Cart();
        int expResult = 0;
        int result = instance.getCartSize();
        assertEquals(expResult, result);
        
    }
    
}
