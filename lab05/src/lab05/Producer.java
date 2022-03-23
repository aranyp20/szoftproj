package lab05;

import java.util.*;


public class Producer extends Thread {
	private int serID;
	String szo;
	Fifo fi;
	int num;
	public Producer(String str, Fifo fif, int n) {
		szo=str;
		fi=fif;
		num=n;
	}
	private void go() throws InterruptedException{
		
		while(true) {
			long time = System.currentTimeMillis()%100000;
			fi.put(szo+ " " + Integer.toString(serID));
			System.out.println("produced " + Integer.toString(serID)+" " + time);
			serID++;
			sleep(num);
		}
		
	}
	public void run() {
		try {
			serID=0;
			this.go();
		}catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		
	}
	
}
