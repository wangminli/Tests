package wml.p158.oneProducer;

public class RunSomeProducerAndSomeCustomer {
    public static void main(String[] args) throws InterruptedException {
	String lock = new String("");
	Producer producer = new Producer(lock);
	Customer customer = new Customer(lock);
	ProductThread[] productThread = new ProductThread[2];
	CustomerThread[] customerThread = new CustomerThread[2];
	
	for(int i = 0; i < 2; i++){
	    productThread[i] = new ProductThread(producer);
	    productThread[i].setName("生产者"+(i+1));
	    customerThread[i] = new CustomerThread(customer);
	    customerThread[i].setName("消费者"+(i+1));
	    productThread[i].start();
	    customerThread[i].start();
	}
	Thread.sleep(5000);
	Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
	Thread.currentThread().getThreadGroup().enumerate(threadArray);
	for(int i = 0; i < threadArray.length; i++){
	    System.out.println(threadArray[i].getName()+" "+ threadArray[i].getState());
	}
    }

}
