package wml.p158.oneProducer;
/**
 * 一个生产者一个消费者的情况。
 * 会出现交替“生产-消费”的结果，没有异常发生。
 * 多个生产者多个消费者，会发生报错情况，看例子，和解决方案
 * @author wangm
 *
 */
public class RunOneProducerAndOneCustomer {
    public static void main(String args[]){
	String lock = new String("");
	Producer producer = new Producer(lock);
	Customer customer = new Customer(lock);
	ProductThread productThread = new ProductThread(producer);
	CustomerThread customerThread = new CustomerThread(customer);
	productThread.start();
	customerThread.start();
    }
}
