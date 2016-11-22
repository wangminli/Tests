package wml.p158.oneProducer;

public class CustomerThread extends Thread {
    private Customer customer;
    public CustomerThread(Customer customer){
	super();
	this.customer = customer;
    }
    
    @Override
    public void run(){
	while(true){
	    customer.getValue();
	}
    }
}
