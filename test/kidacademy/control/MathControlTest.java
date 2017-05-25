/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mann
 */
public class MathControlTest {
    
    public MathControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcVolumeTrianglePrism method, of class MathControl.
     */
    @Test
    public void testCalcVolumeTrianglePrism() {
        System.out.println("calcVolumeTrianglePrism Test 1");
        double base = 10.0;
        double length = 10.0;
        double height = 5.0;
        MathControl instance = new MathControl();
        double expResult = 250.0;
        double result = instance.calcVolumeTrianglePrism(base, length, height);
        assertEquals(expResult, result,0);
        System.out.println("Success");
        
        //Test2
        System.out.println("calcVolumeTrianglePrism Test 2");
        base = -10.0;
        length = 10.0;
        height = 10.0;
        expResult = -1;
        result = instance.calcVolumeTrianglePrism(base, length, height);
        assertEquals(expResult, result,0);
        System.out.println("Success");
                
        //Test3
        System.out.println("calcVolumeTrianglePrism Test 3");
        base = 10.0;
        length = 10.0;
        height = -10.0;
        expResult = -1;
        result = instance.calcVolumeTrianglePrism(base, length, height);
        assertEquals(expResult, result,0);
        System.out.println("Success");
    }
    /**
     * Test of calcAreaTrapezoid method, of class MathControl.
     */
    @Test
    public void testCalcAreaTrapezoid() {
        System.out.println("calcAreaTrapezoid");
        double base1 = 0.0;
        double base2 = 0.0;
        double height = 0.0;
        MathControl instance = new MathControl();
        double expResult = 0.0;
        double result = instance.calcAreaTrapezoid(base1, base2, height);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcDistanceTwoPoints method, of class MathControl.
     */
    @Test
    public void testCalcDistanceTwoPoints() {
        System.out.println("calcDistanceTwoPoints");
        double x1 = 0.0;
        double x2 = 0.0;
        double y1 = 0.0;
        double y2 = 0.0;
        MathControl instance = new MathControl();
        double expResult = 0.0;
        double result = instance.calcDistanceTwoPoints(x1, x2, y1, y2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
