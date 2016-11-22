package wml.p155.waitOld;

public class Add {
    private String lock;
    public Add(String lock){
	this.lock = lock;
    }

    public void add(){
	synchronized(lock){
	    ValueObject.list.add("anyString");
	    System.out.println("加操作完毕，ValueObject的长度是："+ValueObject.list.size());
	    lock.notifyAll(); //通知所有
	}
    }
}	
