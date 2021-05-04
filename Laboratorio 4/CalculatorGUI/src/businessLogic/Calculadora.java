/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

/**
 *
 * @author Anabel
 */
public class Calculadora {
    
    public static float add(float a, float b)
    {
        return a+b;
    }
    
    public static float substract(float a, float b)
    {
        return a-b;
    }
    
    public static float multiply(float a, float b)
    {
        return a*b;
    }
    
    public static float div(float a, float b)
    {
        return a/b;
    }
    
    public static float mod(float a, float b)
    {
        return a%b;
    }
    
    public static float square(float a)
    {
        return (float) Math.sqrt(a);
    }
    
    public static float power(float a)
    {
        return (float) Math.pow(10, a);
    }
    
    public static float fact(float a)
    {
        float result = 1;
        for(int i=2; i<=a; i++){
            result = result * i;
        }
        return result;
    }
    
    public static float log(float a)
    {
        return (float) Math.log10(a);
    }
    public static float signo (float a)
    {
        return a * -1;
    }
}
