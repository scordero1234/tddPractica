package tdd;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.nullable;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

	@RunWith(value = Parameterized.class)
public class CalculatorParameterTest {

	private int  a, b, expected;
	Calculator calculator=null;
	
	@Parameterized.Parameters
	public static Iterable<Object[]> parameters()
	{
		List<Object[]> objects = new ArrayList<Object[]>();
	    objects.add(new Object[]{6,2,4});
		objects.add(new Object[]{6,2,4});
		objects.add(new Object[]{6,2,4});
		objects.add(new Object[]{6,2,4});
		objects.add(new Object[]{6,2,4});
		objects.add(new Object[]{6,2,4});
		objects.add(new Object[]{6,2,4});
		objects.add(new Object[]{6,2,4});

		
		return objects;
		
		
	}
	
	
	public CalculatorParameterTest(int expected,int a, int b) {
		super();
		this.a = a;
		this.b = b;
		this.expected = expected;
	}


	@Test
	public void obtieneParametroCuandoAdisiona() {
		calculator = new Calculator();
		assertEquals(expected, calculator.addition(a, b));
		System.out.println("test1");
	}

}
