package andycpp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class calculatorTest {
	private static Calculator calcu = new Calculator(); //要测试谁就创建谁
	//@Before 标注每测一个方法都调用一次。 如果测试4个方法，就调用4次。
	//@After 标注 每次方法调用完执行一次。
	@Before
	public void setUp() throws Exception {
		calcu.clear();
	}
//标注为@Test的测试类返回必须为void 且不能有参数。
	@Test
	public void testAdd() {
		calcu.add(2);
		calcu.add(3);
		//assertEquals方法来自 org.junit.Assert.*;中的静态方法 
		//JDK5中新增的一个功能静态导入包
		//非静态导入调用是 类名.方法名(); 静态导入后直接方法名();调用
		assertEquals(5, calcu.getResult());  
	}

	@Test
	public void testSubStract() {
		calcu.subStract(10);
		calcu.subStract(2);
		assertEquals(8, calcu.getResult());
	}
	@Ignore("Multiply() Not yet implemented")
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		calcu.add(8);
		calcu.divide(2);
		assertEquals(4, calcu.getResult());
	}
	
	@Test(timeout = 1000)  //时间测试。测试方法不能超过多长时间。
	public void testSquareRoot() {
		calcu.squareRoot(4);
		assertEquals(4, calcu.getResult());
	}
	
	@Test(expected = ArithmeticException.class)  //异常测试如果抛出此异常测试通过。
	public void testDivideByZero() {
		calcu.divide(0);
	}

}
