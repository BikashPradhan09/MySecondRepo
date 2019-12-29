package testNGTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {
	@BeforeTest
	public void beforetest1() {
		System.out.println("BeforeTest 1 :");
	}
	@BeforeTest
	public void beforetest2() {
		System.out.println("BeforeTest 2 :\n");
	}
	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("BeforeMethod 1 :");
	}
	@BeforeMethod
	public void beforeMethod2() {
		System.out.println("BeforeMethod 2 :");
	}
	@Test
	public void test1() {
		System.out.println("Test 1 :");
	}
	@Test
	public void test2() {
		System.out.println("Test 2 :");
	}
	@Test
	public void test3() {
		System.out.println("Test 3 :");
	}
}
