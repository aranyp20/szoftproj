package lab05;
import java.util.*;

public class Consumer extends Thread {
	Fifo fif;
	String str;
	int num;
	public Consumer(Fifo f, String s,int n) {
		fif=f;
		str=s;
		num=n;
	}
	public void run(){
		while(true) {
			long time=System.currentTimeMillis()%100000;
			
			try {
				String ms = fif.get();
				System.out.println("consumed " + str + ms+ " "+time);
			}catch(InterruptedException ex) {
				
			}
			try {
				sleep(num);
			}catch(InterruptedException ex) {
				
			}
			
		}
	}
}
