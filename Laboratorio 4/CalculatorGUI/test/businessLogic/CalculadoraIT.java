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
    @Test
    public void testAdd() {
        System.out.println("add");
        float a = 410F;
        float b = 10F;
        float expResult = 420F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAddTNegative() {
        System.out.println("add two Negative");
        float a = -4F;
        float b = -5F;
        float expResult = -9F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAddFNegative() {
        System.out.println("add first Negative");
        float a = -12F;
        float b = 5F;
        float expResult = -7F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAddSNegative() {
        System.out.println("add second Negative");
        float a = 4F;
        float b = -14F;
        float expResult = -10F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of substract method, of class Calculadora.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        float a = 200F;
        float b = 5F;
        float expResult = 195F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testSubstractNegative() {
        System.out.println("substract two negative");
        float a = -15F;
        float b = -5F;
        float expResult = -10F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testSubstractFNegative() {
        System.out.println("substract first negative");
        float a = -15F;
        float b = 5F;
        float expResult = -20F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testSubstractSNegative() {
        System.out.println("substract second negative");
        float a = 15F;
        float b = -15F;
        float expResult = 30F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of multiply method, of class Calculadora.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        float a = 15F;
        float b = 60F;
        float expResult = 900F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
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
        float b = -100F;
        float expResult = -700F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }

    
    /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        float a = 80F;
        float b = 4F;
        float expResult = 20F;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testDivNegative() {
        System.out.println("div two negative");
        float a = -20F;
        float b = -10F;
        float expResult = 2F;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);   
    }
    @Test
    public void testDivFNegative() {
        System.out.println("div first negative");
        float a = -4F;
        float b = 2F;
        float expResult = -2F;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);   
    }
    @Test
    public void testDivSNegative() {
        System.out.println("div second negative");
        float a = 60F;
        float b = -20F;
        float expResult = -3F;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);   
    }   
    
}
