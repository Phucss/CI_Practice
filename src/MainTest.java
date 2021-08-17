import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class MainTest {

	@Test
	void test1() {
		assertEquals(2, MainFunc.addFunction(1, 1));
	}
	@Test
	void test2() {
		assertEquals(4, MainFunc.addFunction(1, 3));
	}
	@Test
	void test3() {
		assertEquals(0, MainFunc.addFunction(0, 0));
	}
	@Test
	void test4() {
		assertEquals(10, MainFunc.addFunction(9, 1));
	}
	@Test
	void test5() {
		assertEquals(5, MainFunc.addFunction(3, 2));
	}
	@Test
	void test6() {
		assertEquals(2, MainFunc.addFunction(-1, 3));
	}
	

}
