/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.control;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

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
        
        //Test4
        System.out.println("calcVolumeTrianglePrism Test 4");
        base = 10.0;
        length = 0.0;
        height = -10.0;
        expResult = -1;
        result = instance.calcVolumeTrianglePrism(base, length, height);
        assertEquals(expResult, result,0);
        System.out.println("Success");
                
        //Test5
        System.out.println("calcVolumeTrianglePrism Test 5");
        base = 0.0;
        length = 10.0;
        height = 10.0;
        expResult = -1;
        result = instance.calcVolumeTrianglePrism(base, length, height);
        assertEquals(expResult, result,0);
        System.out.println("Success");
                        
        //Test6
        System.out.println("calcVolumeTrianglePrism Test 6");
        base = 10.0;
        length = 0.0;
        height = 10.0;
        expResult = -1;
        result = instance.calcVolumeTrianglePrism(base, length, height);
        assertEquals(expResult, result,0);
        System.out.println("Success");
                                
        //Test7
        System.out.println("calcVolumeTrianglePrism Test 7");
        base = 10.0;
        length = 10.0;
        height = 0.0;
        expResult = -1;
        result = instance.calcVolumeTrianglePrism(base, length, height);
        assertEquals(expResult, result,0);
        System.out.println("Success");
        
        //Test8
        System.out.println("calcVolumeTrianglePrism Test 8");
        base = 1.0;
        length = 1.0;
        height = 1.0;
        expResult = .5;
        result = instance.calcVolumeTrianglePrism(base, length, height);
        assertEquals(expResult, result,0);
        System.out.println("Success");
        
        //Test9
        System.out.println("calcVolumeTrianglePrism Test 9");
        base = 100.0;
        length = 100.0;
        height = 100.0;
        expResult = 500000;
        result = instance.calcVolumeTrianglePrism(base, length, height);
        assertEquals(expResult, result,0);
        System.out.println("Success");
    }
    /**
     * Test of calcAreaTrapezoid method, of class MathControl.
     */
    @Test
    public void testCalcAreaTrapezoid() {
        //Test 1
        System.out.println("calcAreaTrapezoid Test 1");
        double base1 = 0.0;
        double base2 = 0.0;
        double height = 0.0;
        MathControl instance = new MathControl();
        double expResult = 0.0;
        double result = instance.calcAreaTrapezoid(base1, base2, height);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of calcDistanceTwoPoints method, of class MathControl.
     */
    @Test
    public void testCalcDistanceTwoPoints() {
        //Test 1
        System.out.println("calcDistanceTwoPoints Test 1");
        double x1 = 10.0;
        double x2 = 20.0;
        double y1 = 5.0;
        double y2 = 15.0;
        MathControl instance = new MathControl();
        double expResult = 14.14213562;
        double result = instance.calcDistanceTwoPoints(x1, x2, y1, y2);
        double distance = (x2 - x1) + (y2 - y1);
        assertEquals(expResult, result, 0.00000001);
        System.out.println("Success");
        
        //Test 2
        System.out.println("calcDistanceTwoPoints Test 2");
        x1 = 10.0;
        x2 = 10.0;
        y1 = 10.0;
        y2 = 10.0;
        expResult = -1;
        result = instance.calcDistanceTwoPoints(x1, x2, y1, y2);
        assertEquals(expResult, result, 0);
        System.out.println("Success");
    }
