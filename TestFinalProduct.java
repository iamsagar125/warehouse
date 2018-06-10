package FinalProduct;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SAGAR KALAL
 */
public class TestFinalProduct {
    FinalProduct instance = new FinalProduct();
    public TestFinalProduct() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of addProduct method, of class FinishedProduct.
     */
    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        instance.addProduct(101,0,897);
        assertEquals(101,instance.productID);
        assertEquals(897,instance.quantity[0]);
        
        instance.addProduct(109,1,1345);
        assertEquals(109,instance.productID);
        assertEquals(1345,instance.quantity[1]);
        
        instance.addProduct(101,0,897);
        assertEquals(101,instance.productID);
        assertEquals(1794,instance.quantity[0]);
    }
    
    /**
     * Test of removeProduct method, of class FinishedProduct.
     */
    @Test
    public void testRemoveProduct() {
        System.out.println("removeProduct");
        instance.removeProduct(101,0,0);
        assertEquals(101,instance.productID);
        assertEquals(0,instance.quantity[0]);
        
        instance.addProduct(109,1,1345);
        assertEquals(109,instance.productID);
        assertEquals(1345,instance.quantity[1]);

        instance.removeProduct(109,1,1000);
        assertEquals(109,instance.productID);
        assertEquals(345,instance.quantity[1]);
        
        instance.addProduct(101,0,897);
        assertEquals(101,instance.productID);
        assertEquals(897,instance.quantity[0]);
        
        instance.removeProduct(101,0,897);
        assertEquals(101,instance.productID);
        assertEquals(0,instance.quantity[0]);
    }

    
    /**
     * Test of allotEmployee method, of class FinishedProduct.
     */
    @Test
    public void testAllotEmployee(){
        System.out.println("allotEmployee");
        instance.allotEmployee(900,1000,200);
        assertEquals(900,instance.quantity[0]);
        assertEquals(1000,instance.quantity[1]);
        assertEquals(200,instance.quantity[2]);
        assertEquals(70,instance.emplCount);
        
        instance.allotEmployee(1234,235,789);
        assertEquals(1234,instance.quantity[0]);
        assertEquals(235,instance.quantity[1]);
        assertEquals(789,instance.quantity[2]);
        assertEquals(144,instance.emplCount);
    }
    
    /**
     * Test of displayInfo method, of class FinishedProduct.
     */
    @Test
    public void testDisplayInfo() {
        System.out.println("displayInfo");
        instance.displayInfo();
    }
}
