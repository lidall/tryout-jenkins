/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Lida
 */
import calculator.calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class javaTest {
    @Test
    public void calculation_add() throws Exception{
        calculator test1=new calculator(1,2,"add");
        int result1=test1.calculation();
        assertEquals(3, result1);
    }
    @Test
    public void calculation_minus() throws Exception{
        calculator test1=new calculator(1,2,"minus");
        int result1=test1.calculation();
        assertEquals(-1, result1);
    }
    
    @Test
    public void calculation_multiply() throws Exception{
        calculator test1=new calculator(1,0,"multiply");
        int result1=test1.calculation();
        assertEquals(0, result1);
    }
    @Test
    public void calculation_divide() throws Exception{
        calculator test1=new calculator(2,1,"divide");
        
        int result1=test1.calculation();
        assertEquals(2, result1);
    }
    @Test(expected=IllegalArgumentException.class)
    public void calculation_divideException() throws Exception{
        calculator test1=new calculator(2,0,"divide");        
        test1.calculation();
    }
    
}
