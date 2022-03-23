package lab05;
import java.util.ArrayList;

public class Fifo  extends Thread{
	private ArrayList<String> szav; ;
	
	
	public Fifo() {
		szav = new ArrayList<String>(); 
		
	}
	synchronized public void put(String s) throws InterruptedException {
		if(szav.size()==10) 
			this.wait();
	
			szav.add(s);
			this.notify();
		
	}
	synchronized public String get() throws InterruptedException {
		
		if(szav.isEmpty()) 
			this.wait();
		
			
			
			
			String seg = szav.get(0);
			szav.remove(0);
			this.notify();
			return seg;
	
	}
}
