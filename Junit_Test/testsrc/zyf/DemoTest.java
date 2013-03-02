package zyf;


import java.io.PrintStream;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
/**
 * @author zhuyufeng
 * ����Arrays.asList(Object... obj)����ʱ��
 * ���ֵ���һ��������Ϊ�����������͵�ʱ��ᱻ��Ϊһ�����󣬲������������
 * ���ǲ���һ�¡�
 * javaԴ���е� K T V S���� ��ʾ����˼ Type Parameter Conventions
You have already seen the angle bracket and single letter notation used to 
represent a type parameter. By convention, a type parameter is a single, 
uppercase letter �� this allows easy identification and distinguishes a type 
parameter from a class name. The most common type parameters you will see are:

* <T> �� Type
* <S> �� for Type, when T is already in use
* <E> �� Element (used extensively by the Java Collections Framework)
* <K> �� Key
* <V> �� Value
* <N> �� Number
 */
public class DemoTest {
	PrintStream out = System.out;
	@Before
	public void setUp() throws Exception {
		
	}
	@Test
	public void lengthTest(){
		char[] arrc = {'a','b','c','d','e'};  
        out.println("����char���飺");  
        print(arrc);  
        out.println("ֱ�Ӵ��ݣ�");  
        print('a','b','c','d','e');  
        out.println("----------------------------");  
          
        int[] arri = {1,2,3,4,5,6,7};  
        out.println("����int���飺");  
        print(arri);  
        out.println("ֱ�Ӵ��ݣ�");  
        print(1,2,3,4,5,6,7);  
        out.println("----------------------------");  
          
        Integer[] arrInt = {1,2,3,4,5,6,7};  
        out.println("����Integer���飺");  
        print(arrInt);  
        out.println("ֱ�Ӵ��ݣ�");  
        print(1,2,3,4,5,6,7);  
        out.println("----------------------------");  
          
        String[] arrs = {"a","b","c","d","e"};  
        out.println("����String���飺");  
        print(arrs);  
        out.println("ֱ�Ӵ��ݣ�");  
        print('a','b','c','d','e');  
        out.println("----------------------------");  
	}
	
	private void print(Object...arr) {
		out.print("���ݣ�"+Arrays.toString(arr));  
        out.println("\t\t���鳤�ȣ�"+arr.length+" "); 
	}

}
