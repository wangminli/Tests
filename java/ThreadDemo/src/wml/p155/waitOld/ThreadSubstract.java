package wml.p155.waitOld;

public class ThreadSubstract extends Thread {
    private Substract r;
    public ThreadSubstract(Substract r){
	super();
	this.r = r;
    }
    
    @Override
    public void run(){
	r.substract();
    }
}
