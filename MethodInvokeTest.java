import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * 测试Method的Invoke方法
 * */
public class MethodInvokeTest {
	public void doA(String s){
		System.out.println(s+" from a");
	}
	public static void main(String[] args) throws Exception {
		Class classes=Class.forName("MethodTest");
		Object o1=classes.newInstance();
		Method method=classes.getMethod("doA", String.class);
		System.out.println(method);
		method.invoke(o1, new Object[]{"s"});//此处必须要写明具体哪个实例，因为同一个MethodTest类可以有多个实例，后面的数组时传入的参数。此时将执行doA()方法。
	}
}																}:：
