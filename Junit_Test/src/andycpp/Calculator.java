/**
 * Calculator�࣬����һ���ܹ���ʵ�ּӼ��˳���
 * ƽ���������ļ������࣬Ȼ�����Щ���ܽ��е�Ԫ����;
 * �����������bug�Ա㵥Ԫ������ʾ��
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
		result = result -1;  //bug ��ȷӦ����result= result - n
	}
	public void multiply(int n){
		//�˷�����δд��
	}
	public void square(int n){
		result = n*n;
	}
	public void divide(int n){
		result = result/n;
	}
	public void squareRoot(int n){
		while (1==1){
		     //bug ��ѭ��
		} 
	}
	public void clear(){
		result = 0;
	}
	public int getResult(){
		return  result;
	}
}
