package zyf;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 * 
 * @author zhuyufeng
 * �����׼����Ѻܶ������һ�������У�
 * ��һ��������Ϊ�׼���ڣ� ʹ��ע��@RunWith �� @suiteClasses ����������ࡣ
 *
 */
 @RunWith(Suite.class)
 @SuiteClasses({AdvancedTest.class,DemoTest.class})
public class SuiteTest {}
