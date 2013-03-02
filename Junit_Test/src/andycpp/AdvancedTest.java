package andycpp;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/**
 * 测试一个数的平方，参数可能为整数、负数、0；写三个测试方法，分别传不同的参数进去。
 * 但是JUnit4 提出了“参数化测试”的概念，把若干参数一次传入，一次测试。
 * 当然这种情况不能用默认的Runner了，得用ParameterizedRunner
 * @author zhuyufeng
 *
 */
@RunWith(Parameterized.class)
public class AdvancedTest {
	private static Calculator Calcu = new Calculator();
	private int result;
	private int param;

	@Before
	public void setUp() throws Exception {
		Calcu.clear();
	}
	
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][]{{2,4},{0,0},{-3,9}});
	}
	public AdvancedTest(int param,int result){  //参数顺序不能乱。
		this.param=param;
		this.result=result;
	}

	@Test
	public void testSquare() {
		Calcu.square(param);
		assertEquals(result, Calcu.getResult());
	}
}
