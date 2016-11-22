package wml.p158.oneProducer;

public class Producer{
    private String lock;
    public Producer(String lock){
	super();
	this.lock = lock;
    }
    public void setValue() {
	try {
	    synchronized (lock){
	        if(!ValueObject.value.equals("")){
	    		lock.wait();
	        }
	        String value = System.currentTimeMillis()+"";
		ValueObject.value = value;
		System.out.println("set的产品是："+value);
		lock.notify();
	    }
	    
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }
}
