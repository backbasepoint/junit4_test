package zyf;


import java.io.PrintStream;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
/**
 * @author zhuyufeng
 * 在用Arrays.asList(Object... obj)方法时，
 * 发现当传一个集合中为基本数据类型的时候会被视为一个对象，不会解析成数组
 * 于是测试一下。
 * java源码中的 K T V S…… 表示的意思 Type Parameter Conventions
You have already seen the angle bracket and single letter notation used to 
represent a type parameter. By convention, a type parameter is a single, 
uppercase letter — this allows easy identification and distinguishes a type 
parameter from a class name. The most common type parameters you will see are:

* <T> — Type
* <S> — for Type, when T is already in use
* <E> — Element (used extensively by the Java Collections Framework)
* <K> — Key
* <V> — Value
* <N> — Number
 */
public class DemoTest {
	PrintStream out = System.out;
	@Before
	public void setUp() throws Exception {
		
	}
	@Test
	public void lengthTest(){
		char[] arrc = {'a','b','c','d','e'};  
        out.println("传递char数组：");  
        print(arrc);  
        out.println("直接传递：");  
        print('a','b','c','d','e');  
        out.println("----------------------------");  
          
        int[] arri = {1,2,3,4,5,6,7};  
        out.println("传递int数组：");  
        print(arri);  
        out.println("直接传递：");  
        print(1,2,3,4,5,6,7);  
        out.println("----------------------------");  
          
        Integer[] arrInt = {1,2,3,4,5,6,7};  
        out.println("传递Integer数组：");  
        print(arrInt);  
        out.println("直接传递：");  
        print(1,2,3,4,5,6,7);  
        out.println("----------------------------");  
          
        String[] arrs = {"a","b","c","d","e"};  
        out.println("传递String数组：");  
        print(arrs);  
        out.println("直接传递：");  
        print('a','b','c','d','e');  
        out.println("----------------------------");  
	}
	
	private void print(Object...arr) {
		out.print("内容："+Arrays.toString(arr));  
        out.println("\t\t数组长度："+arr.length+" "); 
	}

}
