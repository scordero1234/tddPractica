package tdd;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculatorTest {
    @Test
    public void testAddition() {
        //Vamos a simular la implementacion  con mockito
        ICalculator calculator = Mockito.mock(ICalculator.class);
        Mockito.when(calculator.addition(2, 3)).thenReturn(5);
        assertEquals(5, calculator.addition(2, 3));
    }
    @Test
    public void testSubtraction() {
        ICalculator calculator = Mockito.mock(ICalculator.class);
        Mockito.when(calculator.subtraction(5, 3)).thenReturn(2);
        assertEquals(2, calculator.subtraction(5, 3));
    }
    @Test
    public void testMultiplication() {
        ICalculator calculator = Mockito.mock(ICalculator.class);
        Mockito.when(calculator.multiplication(4, 3)).thenReturn(12);
        assertEquals(12, calculator.multiplication(4, 3));
    }
    @Test
    public void testDivision() {
        ICalculator calculator = Mockito.mock(ICalculator.class);
        Mockito.when(calculator.division(10, 2)).thenReturn(5);
        assertEquals(5, calculator.division(10, 2));
    }
}