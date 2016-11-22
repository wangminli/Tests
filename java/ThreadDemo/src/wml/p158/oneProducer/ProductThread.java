package wml.p158.oneProducer;

public class ProductThread extends Thread{
    private Producer producer;
    public ProductThread(Producer producer){
	super();
	this.producer = producer;
    }
    @Override
    public void run(){
	while(true){
	    producer.setValue();
	}
    }
}
