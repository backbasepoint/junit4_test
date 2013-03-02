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
 * ����һ������ƽ������������Ϊ������������0��д�������Է������ֱ𴫲�ͬ�Ĳ�����ȥ��
 * ����JUnit4 ����ˡ����������ԡ��ĸ�������ɲ���һ�δ��룬һ�β��ԡ�
 * ��Ȼ�������������Ĭ�ϵ�Runner�ˣ�����ParameterizedRunner
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
	public AdvancedTest(int param,int result){  //����˳�����ҡ�
		this.param=param;
		this.result=result;
	}

	@Test
	public void testSquare() {
		Calcu.square(param);
		assertEquals(result, Calcu.getResult());
	}
}
