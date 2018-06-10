/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempproj;

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
public class FinishedProductTest {
    
    public FinishedProductTest() {
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
        int pid = 0;
        int s = 0;
        FinishedProduct instance = new FinishedProduct();
        instance.addProduct(pid, s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeProduct method, of class FinishedProduct.
     */
    @Test
    public void testRemoveProduct() {
        System.out.println("removeProduct");
        int pid = 0;
        int s = 0;
        FinishedProduct instance = new FinishedProduct();
        instance.removeProduct(pid, s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allotEmployee method, of class FinishedProduct.
     */
    @Test
    public void testAllotEmployee() {
        System.out.println("allotEmployee");
        FinishedProduct instance = new FinishedProduct();
        instance.allotEmployee();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayInfo method, of class FinishedProduct.
     */
    @Test
    public void testDisplayInfo() {
        System.out.println("displayInfo");
        FinishedProduct instance = new FinishedProduct();
        instance.displayInfo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
