package andycpp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class calculatorTest {
	private static Calculator calcu = new Calculator(); //Ҫ����˭�ʹ���˭
	//@Before ��עÿ��һ������������һ�Ρ� �������4���������͵���4�Ρ�
	//@After ��ע ÿ�η���������ִ��һ�Ρ�
	@Before
	public void setUp() throws Exception {
		calcu.clear();
	}
//��עΪ@Test�Ĳ����෵�ر���Ϊvoid �Ҳ����в�����
	@Test
	public void testAdd() {
		calcu.add(2);
		calcu.add(3);
		//assertEquals�������� org.junit.Assert.*;�еľ�̬���� 
		//JDK5��������һ�����ܾ�̬�����
		//�Ǿ�̬��������� ����.������(); ��̬�����ֱ�ӷ�����();����
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
	
	@Test(timeout = 1000)  //ʱ����ԡ����Է������ܳ����೤ʱ�䡣
	public void testSquareRoot() {
		calcu.squareRoot(4);
		assertEquals(4, calcu.getResult());
	}
	
	@Test(expected = ArithmeticException.class)  //�쳣��������׳����쳣����ͨ����
	public void testDivideByZero() {
		calcu.divide(0);
	}

}
