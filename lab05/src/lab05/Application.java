package lab05;
import java.util.*;


public class Application{
	static public void main(String[] args) {
		Fifo fif = new Fifo();
		Producer pro = new Producer("Alma",fif,1000);
		Consumer con = new Consumer(fif,"Korte",100);
		pro.start();
		
		
		con.start();
		
		
	}
}
