package wml.p155.waitOld;
/**
 * 测试这种情况：在wait/notify模式时，wait条件发生了变化，也容易造成程序的逻辑轮乱。
 * 这里测试了一次加操作，两次减操作的情况，Substract减操作的wait条件发生了变化。
 * 其中，如果将Substract中的if改为while，程序的执行变得有序。
 * @author wangm
 *
 */
public class Run {
    public static void main(String a[]){
	String lock = new String("");
	Add add = new Add(lock);
	Substract substract = new Substract(lock);
	System.out.println("ValueObject的初始长度是： "+ ValueObject.list.size());
	
	ThreadSubstract substractThread1 = new ThreadSubstract(substract);
	substractThread1.setName("substractThread1");
	substractThread1.start();
	
	ThreadSubstract substractThread2 = new ThreadSubstract(substract);
	substractThread2.setName("substractThread2");
	substractThread2.start();
	try {
	    Thread.sleep(1000);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	
	ThreadAdd addThread = new ThreadAdd(add);
	addThread.setName("addThread");
	addThread.start();
    }
}
