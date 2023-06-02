package tdd;

import static org.junit.Assert.*;

import org.junit.*;

import java.util.Date;

public class CalculaTest {

public static int add(int a, int b)
{
	return a+b;
}
Calculator calculator =null;
@Test
public void devuelveSumaOK() {
 int expedcted=7;
 System.out.println("addition");
 assertEquals(expedcted,calculator.addition(3, 4));
}
@Before
public  void setUp()
{
	calculator= new Calculator();
	System.out.println("setUp");
}

	@Test
	public void devuelveRestaOK() {
	    int expected=5;
		assertEquals(expected, calculator.sustraction(10, 5));
		System.out.println("sustraction");
	}

	@BeforeClass
	public static void abreConexion ()
	{
		System.err.println("abre la conexion");
	}


	@Test()
	public void devuelveMultiplicacionOK()
	{   System.out.println("multiplication");
		long expected=10;
		assertEquals(expected,calculator.multiplication(5,2));

	}

	@Test()
	public void devuelveDivisionOK()
	{   System.out.println("division");
		long expected=10;
		assertEquals(expected,calculator.division(20,0));

	}
	@Test(expected = ArithmeticException.class)
	public void devuelveCuandoDivisionTengaException()
	{
		assertEquals(5,calculator.division(10,0));
		System.out.println("Controla la excepcion");
	}

	@Test(timeout = 120)
	public void devuelveMultiplicacionTimeOutOK()
	{
		System.out.println("Inicia"+new Date());
		assertEquals(10,calculator.multiplicationTimeOut(5,2));
		System.out.println("devuelveMultiplicacionTimeOutOK"+new Date());
	}
	@After
	public void tearDown()
	{	System.err.println("tearDown");
		calculator.setAns(0);
		calculator=null;

	}


	@AfterClass
	public static void cierraConexion ()
	{
		System.err.println("cierrra la conexion");
	}
}
