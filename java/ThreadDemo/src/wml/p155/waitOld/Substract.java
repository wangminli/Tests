package wml.p155.waitOld;

public class Substract {
    private String lock;
    public Substract(String lock){
	this.lock = lock;
    }
    public void substract(){
	try {
	    synchronized (lock){
	        if/*while*/(ValueObject.list.size() == 0){
	            System.out.println("wait begin TheadName = " + Thread.currentThread().getName());
	            lock.wait();
	            System.out.println("wait end ThreadName = " + Thread.currentThread().getName());
	        }
	        //现在才开始减的操作
	        ValueObject.list.remove(0);
	        System.out.println("减操作完毕： list size = " + ValueObject.list.size()+"， 执行的线程是：" + Thread.currentThread().getName());
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
