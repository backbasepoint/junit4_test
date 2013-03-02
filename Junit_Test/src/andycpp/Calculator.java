/**
 * Calculator类，这是一个能够简单实现加减乘除、
 * 平方、开方的计算器类，然后对这些功能进行单元测试;
 * 该类故意留有bug以便单元测试演示。
 */
package andycpp;

/**
 * @author zhuyufeng
 * 2013-3-1
 */
public class Calculator {
	private static int result;
	
	public void add(int n){
		result = result +n;
	}
	public void subStract(int n){
		result = result -1;  //bug 正确应该是result= result - n
	}
	public void multiply(int n){
		//此方法尚未写好
	}
	public void square(int n){
		result = n*n;
	}
	public void divide(int n){
		result = result/n;
	}
	public void squareRoot(int n){
		while (1==1){
		     //bug 死循环
		} 
	}
	public void clear(){
		result = 0;
	}
	public int getResult(){
		return  result;
	}
}
