package zyf;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 * 
 * @author zhuyufeng
 * 测试套件（把很多测试类一次性运行）
 * 用一个空类作为套件入口， 使用注解@RunWith 和 @suiteClasses 修饰这个空类。
 *
 */
 @RunWith(Suite.class)
 @SuiteClasses({AdvancedTest.class,DemoTest.class})
public class SuiteTest {}
