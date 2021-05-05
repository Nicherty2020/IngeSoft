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
    public void testAddZero() {
        System.out.println("add zero");
        float a = 54F;
        float b = 0F;
        float expResult = 54F;
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

    @Test
    public void testSubstractZero() {
        System.out.println("substract zero");
        float a = 0F;
        float b = 15F;
        float expResult = -15F;
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

    @Test
    public void testMultiplyZero() {
        System.out.println("multiply zero");
        float a = 75F;
        float b = 0F;
        float expResult = 0F;
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
    public void testDivNZero() {
        System.out.println("div zero");
        float a = 9F;
        float b = 0F;
        String expResult = "Infinity";
        String result = Float.toString(Calculadora.div(a, b));
        assertEquals(expResult, result, "Infinity");
    }

    @Test
    public void testDivZero() {
        System.out.println("div");
        float a = 0F;
        float b = 5F;
        float expResult = 0F;
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

    /**
     * Test of mod method, of class Calculadora.
     */
    @Test
    public void testMod() {
        System.out.println("mod");
        float a = 93F;
        float b = 5F;
        float expResult = 3F;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testModNNegative() {
        System.out.println("mod first less");
        float a = 25F;
        float b = 183F;
        float expResult = 25F;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testModSNegative() {
        System.out.println("mod Second negative");
        float a = 47F;
        float b = -6F;
        float expResult = -1F;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testModFNegative() {
        System.out.println("mod first negative");
        float a = -4F;
        float b = 59F;
        float expResult = 55F;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testModNegatives() {
        System.out.println("mod negatives");
        float a = -82F;
        float b = -21F;
        float expResult = -19F;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testModZero() {
        System.out.println("mod zero");
        float a = 0F;
        float b = 9F;
        float expResult = 0F;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testModNZero() {
        System.out.println("mod zero NaN");
        float a = 8F;
        float b = 0F;
        String expResult = "NaN";
        String result = Float.toString(Calculadora.mod(a, b));
        assertEquals(expResult, result, "NaN");
    }

    /**
     * Test of log method, of class Calculadora.
     */
    @Test
    public void testLog() {
        System.out.println("logarithmic ");
        float a = 4F;
        float expResult = 0.60206F;
        float result = Calculadora.log(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testLogNeg() {
        System.out.println("logarithmic negative");
        float a = -8F;
        String expResult = "NaN";
        String result = Float.toString(Calculadora.log(a));
        assertEquals(expResult, result, "NaN");
    }

    @Test
    public void testLogDec() {
        System.out.println("logarithmic decimal ");
        float a = 7.9F;
        float expResult = 0.8976271F;
        float result = Calculadora.log(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testLogZero() {
        System.out.println("logarithmic zero ");
        float a = 0F;
        String expResult = "-Infinity";
        String result = Float.toString(Calculadora.log(a));
        assertEquals(expResult, result, "-Infinity");
    }

    /**
     * Test of square method, of class Calculadora.
     */
    @Test
    public void testSquare() {
        System.out.println("square ");
        float a = 9F;
        float expResult = 3F;
        float result = Calculadora.square(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSquareN() {
        System.out.println("square negative ");
        float a = -4F;
        String expResult = "NaN";
        String result = Float.toString(Calculadora.log(a));
        assertEquals(expResult, result, "NaN");
    }

    @Test
    public void testSquareDec() {
        System.out.println("square decimal ");
        float a = 15.8F;
        float expResult = 3.9749215F;
        float result = Calculadora.square(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSquareZero() {
        System.out.println("square zero ");
        float a = 0F;
        float expResult = 0F;
        float result = Calculadora.square(a);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of factorial method, of class Calculadora.
     */
    @Test
    public void testfact() {
        System.out.println("factorial ");
        float a = 4F;
        float expResult = 24F;
        float result = Calculadora.fact(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testfactZero() {
        System.out.println("factorial zero");
        float a = 0F;
        float expResult = 1F;
        float result = Calculadora.fact(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testfactDec() {
        System.out.println("factorial decimal");
        float a = 3.74F;
        float expResult = 6F;
        float result = Calculadora.fact(a);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of power method, of class Calculadora.
     */
    @Test
    public void testPower() {
        System.out.println("power ");
        float a = 4F;
        float expResult = 10000F;
        float result = Calculadora.power(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testPowerDec() {
        System.out.println("power decimal ");
        float a = 1.8F;
        float expResult = 63.095726F;
        float result = Calculadora.power(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testPowerNeg() {
        System.out.println("power Negative ");
        float a = -3F;
        float expResult = 0.001F;
        float result = Calculadora.power(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testPowerZero() {
        System.out.println("power Zero ");
        float a = 0F;
        float expResult = 1F;
        float result = Calculadora.power(a);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of signo method, of class Calculadora.
     */
    @Test
    public void testSigno() {
        System.out.println("signo ");
        float a = 72F;
        float expResult = -72F;
        float result = Calculadora.signo(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSignoN() {
        System.out.println("signo Negative");
        float a = -69F;
        float expResult = 69F;
        float result = Calculadora.signo(a);
        assertEquals(expResult, result, 0.0);
    }

}
