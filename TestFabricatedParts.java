/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KRISHNA KALAL
 */
public class TestFabricatedParts {
    FabricatedParts instance = new FabricatedParts();    
    
    public TestFabricatedParts() {
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
     * Test of addProduct method, of class FabricatedParts.
     */
    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        instance.addProduct(109,0,1897);
        assertEquals(109,instance.partID);
        assertEquals(1897,instance.quantity[0]);
        
        instance.addProduct(105,1,1345);
        assertEquals(105,instance.partID);
        assertEquals(1345,instance.quantity[1]);
        
        instance.addProduct(101,0,900);
        assertEquals(101,instance.partID);
        assertEquals(2797,instance.quantity[0]);
    }
    
    /**
     * Test of removeProduct method, of class FabricatedParts.
     */
    @Test
    public void testRemoveProduct() {
        System.out.println("removeProduct");
        instance.removeProduct(101,0,0);
        assertEquals(101,instance.partID);
        assertEquals(0,instance.quantity[0]);
        
        instance.addProduct(103,1,1345);
        assertEquals(103,instance.partID);
        assertEquals(1345,instance.quantity[1]);

        instance.removeProduct(109,1,1000);
        assertEquals(109,instance.partID);
        assertEquals(345,instance.quantity[1]);
        
        instance.addProduct(101,0,897);
        assertEquals(101,instance.partID);
        assertEquals(897,instance.quantity[0]);
        
        instance.removeProduct(101,0,897);
        assertEquals(101,instance.partID);
        assertEquals(0,instance.quantity[0]);
    }

    
    /**
     * Test of allotEmployee method, of class FabricatedParts.
     */
    @Test
    public void testAllotEmployee(){
        System.out.println("allotEmployee");
        instance.allotEmployee(1200,100,200);
        assertEquals(1200,instance.quantity[0]);
        assertEquals(100,instance.quantity[1]);
        assertEquals(200,instance.quantity[2]);
        assertEquals(55,instance.emplCount);
        
        instance.allotEmployee(1234,235,789);
        assertEquals(1234,instance.quantity[0]);
        assertEquals(235,instance.quantity[1]);
        assertEquals(789,instance.quantity[2]);
        assertEquals(129,instance.emplCount);
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
