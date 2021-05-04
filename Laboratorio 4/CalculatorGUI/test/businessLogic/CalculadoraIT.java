/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anabel
 */
public class CalculadoraIT {
    
    public CalculadoraIT() {
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
     * Test of add method, of class Calculadora.
     */
//    @Test
//    public void testAdd() {
//        System.out.println("add");
//        float a = 3F;
//        float b = 5F;
//        float expResult = 8F;
//        float result = Calculadora.add(a, b);
//        assertEquals(expResult, result, 0.0);
//    }
//    
//    @Test
//    public void testAddTNegative() {
//        System.out.println("add two Negative");
//        float a = -4F;
//        float b = -5F;
//        float expResult = -9F;
//        float result = Calculadora.add(a, b);
//        assertEquals(expResult, result, 0.0);
//    }
//    
//    @Test
//    public void testAddFNegative() {
//        System.out.println("add first Negative");
//        float a = -12F;
//        float b = 5F;
//        float expResult = -7F;
//        float result = Calculadora.add(a, b);
//        assertEquals(expResult, result, 0.0);
//    }
//    
//    @Test
//    public void testAddSNegative() {
//        System.out.println("add second Negative");
//        float a = 4F;
//        float b = -14F;
//        float expResult = -10F;
//        float result = Calculadora.add(a, b);
//        assertEquals(expResult, result, 0.0);
//    }
//
//    /**
//     * Test of substract method, of class Calculadora.
//     */
//    @Test
//    public void testSubstract() {
//        System.out.println("substract");
//        float a = 10F;
//        float b = 5F;
//        float expResult = 5F;
//        float result = Calculadora.substract(a, b);
//        assertEquals(expResult, result, 0.0);
//        
//    }
//
//    /**
//     * Test of multiply method, of class Calculadora.
//     */
//    @Test
//    public void testMultiply() {
//        System.out.println("multiply");
//        float a = 7F;
//        float b = 2F;
//        float expResult = 14F;
//        float result = Calculadora.multiply(a, b);
//        assertEquals(expResult, result, 0.0);
//        
//    }
    @Test
    public void testMultiplyNegative() {
        System.out.println("multiply two negative");
        float a = -7F;
        float b = -5F;
        float expResult = 35F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testMultiplyFNegative() {
        System.out.println("multiply first negative");
        float a = -5F;
        float b = 5F;
        float expResult = -25F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testMultiplySNegative() {
        System.out.println("multiply second negative");
        float a = 7F;
        float b = -1F;
        float expResult = -7F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }

    
    
//
//    /**
//     * Test of div method, of class Calculadora.
//     */
//    @Test
//    public void testDiv() {
//        System.out.println("div");
//        float a = 20F;
//        float b = 5F;
//        float expResult = 4F;
//        float result = Calculadora.div(a, b);
//        assertEquals(expResult, result, 0.0);
//        
//    }
    
}
