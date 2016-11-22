package wml.p158.oneProducer;

public class Customer {
    private String lock;
    public Customer(String lock){
	super();
	this.lock = lock;
    }
    public void getValue(){
	try {
	    synchronized(lock){
	        if(ValueObject.value.equals("")){
	            lock.wait();
	        }
	        System.out.println("get的产品是："+ValueObject.value);
	        ValueObject.value = "";//已消费
	        lock.notify();//通知继续生产
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
