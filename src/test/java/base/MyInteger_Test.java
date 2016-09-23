package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
	@Test
	public void testisEven() {
		MyInteger myIntEven = new MyInteger(4);
		MyInteger myIntOdd = new MyInteger(5);
		assertTrue(myIntEven.isEven() == true);
		assertFalse(myIntOdd.isEven() == true);
	}
	@Test
	public void testisOdd() {
		MyInteger myIntOdd = new MyInteger(5);
		MyInteger myIntEven = new MyInteger(4);
		assertTrue(myIntOdd.isOdd() == true);
		assertFalse(myIntEven.isOdd() == true);
	}
	@Test
	public void testisPrime() {
		MyInteger IntPrime = new MyInteger(17);
		MyInteger IntNotPrime = new MyInteger(6);
		assertTrue(IntPrime.isPrime() == true);
		assertFalse(IntNotPrime.isPrime() == true);
	}
	@Test
	public void testisEven1() {
		MyInteger myIntEven1 = new MyInteger(10);
		MyInteger myIntOdd1 = new MyInteger(333);
		assertTrue(myIntEven1.isEven() == true);
		assertFalse(myIntOdd1.isEven() == true);
	}
	@Test
	public void testisOdd1() {
		MyInteger myIntOdd1 = new MyInteger(13);
		MyInteger myIntEven1 = new MyInteger(8);
		assertTrue(myIntOdd1.isOdd() == true);
		assertFalse(myIntEven1.isOdd() == true);
	}
	@Test
	public void testisPrime1() {
		MyInteger IntPrime1 = new MyInteger(7);
		MyInteger IntNotPrime1 = new MyInteger(12);
		assertTrue(IntPrime1.isPrime() == true);
		assertFalse(IntNotPrime1.isPrime() == true);
	}
	@Test
	public void testEqualsInt() {
		MyInteger IntEquals = new MyInteger(5);
		assertTrue(IntEquals.equals(5) == true);
		assertFalse(IntEquals.equals(3) == true);
	}
	@Test
	public void testEqualsInt1() {
		MyInteger IntEquals = new MyInteger(5);
		assertTrue(IntEquals.equals(5) == true);
		assertFalse(IntEquals.equals(7) == true);
	}
}
