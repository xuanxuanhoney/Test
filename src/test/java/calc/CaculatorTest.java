package calc;

//ttt

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CaculatorTest {
	private static CalculatorMain calc;
	
	@BeforeClass
	public static void setup(){
		calc = new CalculatorMain();
	}
	
	@Test
	public void testAdd() {
		assertEquals(5, calc.add(3,2));
	}
	@Test
	public void testSub() {
		assertEquals(1, calc.sub(3,2));
	}
	@Test
	public void testMul() {
		assertEquals(6, calc.mul(3,2));
	}
	@Test
	public void testDiv() {
		assertEquals(1, calc.div(2,2));
	}
	@Test
	public void testDivByZero() {
		assertEquals(0, calc.div(3,0));
	}
	@Test
	public void testPresedence() {
		assertEquals(30, calc.add(calc.mul(5, 5), calc.div(10, 2)));
	}
	@Test
	public void testAdd2() {
		assertEquals(10, calc.add(7, 3));
	}
	@Test
	public void testAbs() {
		assertEquals(3, calc.abs(3));
	}
	@Test
	public void testAbs2() {
		assertEquals(7, calc.abs(7));
	}
	@Test
	public void testArs(){
		assertEquals(4, calc.ars(2));
	}
	@Test
	public void testAddsub() {
		assertEquals(9 , calc.add(calc.sub(5, 1),calc.add(2, 3)));
	}
	@Test
	public void testArs2(){
		assertEquals(9, calc.ars(3));
	}
}
